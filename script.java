// Get the header element
const header = document.querySelector('header');

// Listen for the scroll event
window.addEventListener('scroll', function () {
    if (window.scrollY > 50) { // When user scrolls more than 50px down

        header.classList.add('transparent');   // Add transparent class
    } else {
        header.classList.remove('transparent'); // Remove transparent class when at the top
    }
});
