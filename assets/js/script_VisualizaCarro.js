const slider = document.querySelectorAll('.slider')
const btnPrev = document.getElementById("prev_button")
const btnNext = document.getElementById("next_button")

let currentSLide = 0;

function hideSlider() {
    slider.forEach(item => item.classList.remove('on'))
}

function showSlider() {
    slider[currentSLide].classList.add('on')
}

function nextSlider() {
    hideSlider()
    if(currentSLide === slider.length - 1) {
        currentSLide = 0
    }else {
        currentSLide++
    }

    showSlider()
}

function prevSlider() {
    hideSlider()
    if(currentSLide === 0) {
        currentSLide = slider.length - 1
    }else {
        currentSLide--
    }
    showSlider()
}

btnNext.addEventListener('click', nextSlider)
btnPrev.addEventListener('click', prevSlider)