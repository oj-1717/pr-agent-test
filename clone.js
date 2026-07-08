 

 
function isMobileDevice() {
  return /Mobi|Android/i.test(navigator.userAgent);
}

 
if (isMobileDevice()) {
 
  window.location.href = 'rickroll.html';
}

let faqboxes = document.querySelectorAll('.faqbox');
let drops = document.querySelectorAll('.drop');
 

faqboxes.forEach((box, index) => {
    box.addEventListener('click', () => {
        let drop = drops[index];
        
        
        if (drop.style.display === 'none' || drop.style.display === '') {
            drop.style.display = 'block';
            faqboxes.style.margin = '1px auto';
        } else {
            drop.style.display = 'none';
            faqboxes.style.margin = '1px auto';
          }
    });
});
