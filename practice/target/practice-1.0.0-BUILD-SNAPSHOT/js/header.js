const toggleBtn = document.querySelector('.header__toggleBtn');
const menu = document.querySelector('.header__nav');

toggleBtn.addEventListener('click', () => {
    menu.classList.toggle('active');
});