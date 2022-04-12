package me.spring.bbs.dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.PreparedStatementSetter;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import me.spring.bbs.beans.BBSEntity;

@Repository
public class BBSDao implements IBBSDao {

	private final JdbcTemplate jdbcTemplate;
	
	@Autowired
	public BBSDao(JdbcTemplate jdbcTemplate) {

		this.jdbcTemplate = jdbcTemplate;

	}

	@Override
	public int insert(BBSEntity bbsEntity) {
		// TODO Auto-generated method stub
		String SQL = "insert into bbs values(bbs_seq.nextval,?,?,?,sysdate,0,?)";
		return jdbcTemplate.update(SQL, new PreparedStatementSetter() {

			@Override
			public void setValues(PreparedStatement ps) throws SQLException {
				// TODO Auto-generated method stub
				System.out.println("bbs insert");
				ps.setString(1, bbsEntity.getTitle());
				ps.setString(2, bbsEntity.getContent());
				ps.setString(3, bbsEntity.getWrite());
				ps.setString(4, bbsEntity.getCategory());
				System.out.println(bbsEntity);
			}

		});
	}

	@Override
	public BBSEntity select(int num) {
		// TODO Auto-generated method stub
		List<BBSEntity> bbsEnts = null;
		String SQL = "select * from bbs where num=?";
		bbsEnts = jdbcTemplate.query(SQL, new RowMapper<BBSEntity>() {

			@Override
			public BBSEntity mapRow(ResultSet rs, int rowNum) throws SQLException {
				// TODO Auto-generated method stub
				System.out.println("select동작");
				
				BBSEntity bbsEnt = new BBSEntity();
				bbsEnt.setNumber(rs.getInt("Num"));
				bbsEnt.setCategory(rs.getString("Category"));
				bbsEnt.setTitle(rs.getString("Title"));
				bbsEnt.setContent(rs.getString("Content"));
				bbsEnt.setWrite(rs.getString("Write"));
				bbsEnt.setRegdate(rs.getTimestamp("RegDate"));
				bbsEnt.setHit(rs.getInt("Hit"));
				return bbsEnt;
			}

		},num);
		
		if (bbsEnts == null || bbsEnts.isEmpty())
			return null;
		return bbsEnts.get(0);
		
	}

	@Override
	public int update(BBSEntity bbsEntity) {
		// TODO Auto-generated method stub
		String SQL = "update bbs set title=?,content=?,category=?,hit=? where num=?";
		return jdbcTemplate.update(SQL, new PreparedStatementSetter() {

			@Override
			public void setValues(PreparedStatement ps) throws SQLException {
				// TODO Auto-generated method stub
				System.out.println("bbs update");
				ps.setString(1, bbsEntity.getTitle());
				ps.setString(2, bbsEntity.getContent());
				ps.setString(3, bbsEntity.getCategory());
				ps.setInt(4, bbsEntity.getHit());
				ps.setInt(5, bbsEntity.getNum());
				System.out.println(bbsEntity);
			}

		});
	}

	@Override
	public int delete(int num) {
		// TODO Auto-generated method stub
		String SQL = "delete bbs where num=?";
		return jdbcTemplate.update(SQL, new PreparedStatementSetter() {

			@Override
			public void setValues(PreparedStatement ps) throws SQLException {
				// TODO Auto-generated method stub
				System.out.println("delete동작");
				ps.setInt(1, num);
			}
		});
	}

	@Override
	public List<BBSEntity> selectAll() {
		
		List<BBSEntity> bbsEnts = null;
		String SQL = "select * from bbs";
		bbsEnts = jdbcTemplate.query(SQL, new RowMapper<BBSEntity>() {

			@Override
			public BBSEntity mapRow(ResultSet rs, int rowNum) throws SQLException {
				// TODO Auto-generated method stub
				System.out.println("selectAll동작");
				BBSEntity bbsEnt = new BBSEntity();
				bbsEnt.setNumber(rs.getInt("Num"));
				bbsEnt.setCategory(rs.getString("Category"));
				bbsEnt.setTitle(rs.getString("Title"));
				bbsEnt.setContent(rs.getString("Content"));
				bbsEnt.setWrite(rs.getString("Write"));
				bbsEnt.setRegdate(rs.getTimestamp("RegDate"));
				bbsEnt.setHit(rs.getInt("Hit"));
				return bbsEnt;
			}

		});
		
		if (bbsEnts == null || bbsEnts.isEmpty())
			return null;
		return bbsEnts;
	}

}
