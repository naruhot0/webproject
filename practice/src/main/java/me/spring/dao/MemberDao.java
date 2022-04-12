package me.spring.dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.PreparedStatementSetter;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import me.spring.beans.MemberEntity;

@Repository
public class MemberDao implements IMemberDao {
	private final JdbcTemplate jdbcTemplate;
	
	@Autowired
	public MemberDao(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;}
	

	@Override
	public int insert(MemberEntity mEt) {
		// TODO Auto-generated method stub
		String SQL = "insert into member values (?,?,?,?)";
		return jdbcTemplate.update(SQL, new PreparedStatementSetter() {

			@Override
			public void setValues(PreparedStatement pstmt) throws SQLException {
				// TODO Auto-generated method stub
				System.out.println("insert동작");
				pstmt.setString(1, mEt.getId());
				pstmt.setString(2, mEt.getPwd());
				pstmt.setString(3, mEt.getName());
				pstmt.setString(4, mEt.getEmail());
			}
		});
	}

	@Override
	public MemberEntity select(String id) {
		// TODO Auto-generated method stub
		List<MemberEntity> mEts = null;
		String SQL = "select * from member where id=?";
		mEts = jdbcTemplate.query(SQL, new RowMapper<MemberEntity>() {
			
			@Override
			public MemberEntity mapRow(ResultSet rs, int rowNum) throws SQLException {
				// TODO Auto-generated method stub
				System.out.println("select동작");
				MemberEntity mEt = new MemberEntity();
				mEt.setId(rs.getString("ID"));
				mEt.setPwd(rs.getString("Pwd"));
				mEt.setName(rs.getString("Name"));
				mEt.setEmail(rs.getString("Email"));
				System.out.println("select에 주입끝");
				return mEt;
			}

		}, id);

		if (mEts == null || mEts.isEmpty())
			return null;
		return mEts.get(0);
	}

	@Override
	public int update(MemberEntity mEt) {
		// TODO Auto-generated method stub
		String SQL = "update member set pwd=?, name=?, email? where id=?";
		return jdbcTemplate.update(SQL, new PreparedStatementSetter() {

			@Override
			public void setValues(PreparedStatement pstmt) throws SQLException {
				// TODO Auto-generated method stub
				System.out.println("update동작");
				pstmt.setString(1, mEt.getPwd());
				pstmt.setString(2, mEt.getName());
				pstmt.setString(3, mEt.getEmail());
				pstmt.setString(4, mEt.getId());
			}
		});
	}

	@Override
	public int delete(String id) {
		// TODO Auto-generated method stub
		String SQL = "delete member where id=?";
		return jdbcTemplate.update(SQL, new PreparedStatementSetter() {

			@Override
			public void setValues(PreparedStatement pstmt) throws SQLException {
				// TODO Auto-generated method stub
				System.out.println("delete동작");
				pstmt.setString(1, id);
			}
		});
	}

	@Override
	public List<MemberEntity> selectAll() {
		// TODO Auto-generated method stub
		List<MemberEntity> members = null;
		//try {
			String SQL = "select * from member";
			members = jdbcTemplate.query(SQL, new RowMapper<MemberEntity>() {

				@Override
				public MemberEntity mapRow(ResultSet rs, int rowNum) throws SQLException {
					// TODO Auto-generated method stub
					MemberEntity member = new MemberEntity();
					member.setId(rs.getString("Id"));
					member.setPwd(rs.getString("Pwd"));
					member.setName(rs.getString("Name"));
					member.setEmail(rs.getString("Email"));
					return member;
				}
			});
		//} catch (Exception e) {
		//	return null;
		//}
		if (members == null || members.isEmpty()) return null;
		return members;
	}
	
	
	
	
}
