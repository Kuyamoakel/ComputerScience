
// variables
const timer = document.getElementById("timer");
const startButton = document.getElementById("start");
const pauseButton = document.getElementById("pause");
const restartButton = document.getElementById("restart");

// sounds
const clickSound = new Audio("assets/audio/Click-Gun.mp3");
const rainingSound = new Audio("assets/audio/RainingSound.mp3");


let timeleft = 25 * 60;
let interval = null;

function clickingSound() {
    clickSound.play();
}

function updateTimer() {
    let minutes = Math.floor(timeleft / 60);
    let seconds = timeleft % 60;

    minutes = String(minutes).padStart(2, "0");
    seconds = String(seconds).padStart(2, "0");

    timer.textContent = `${minutes}:${seconds}`;
}

function startTimer() {
    if (interval !== null) {
        return;
    }
    
    rainingSound.loop = true;
    rainingSound.play();

    interval = setInterval(() => {

        timeleft--;

        updateTimer();

        if (timeleft <= 0) {
            clearInterval(interval);
            interval = null;

            alert("POMODORO FINISHED!")
        }

    }, 1000)
}

function pauseTimer() {
    rainingSound.pause();
    rainingSound.currentTime = 0;

    clearInterval(interval);
    interval = null;
}

function resetTimer() {

    rainingSound.pause();
    rainingSound.currentTime = 0;
    clearInterval(interval);
    interval = null;
    timeleft = 25 * 60;

    timer.textContent = "25:00";
}

startButton.addEventListener("click", startTimer);
pauseButton.addEventListener("click", pauseTimer);
restartButton.addEventListener("click", resetTimer);

updateTimer();