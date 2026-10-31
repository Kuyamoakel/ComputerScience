const plus = document.getElementById("increment");
const dec = document.getElementById("decrement");
const progress = document.getElementById("progress");
const target = document.getElementById("target");
const progressBar = document.getElementById("progress-bar");
const questTitle = document.getElementById("quest-title");
const questDescription = document.getElementById("quest-description");
const questXp = document.getElementById("quest-xp");
const xpValue = document.getElementById("xp-value");

let currentQuestIndex = 0;
let xpValueHolder = 0;


const quests = [
    {
        id: 1,
        title: "Cross Training",
        description: "Complete 20 cross solves to improve your speed and efficiency.",
        progress: 0,
        target: 20,
        xp: 100,
        completed: false
    },
    {
        id: 2,
        title: "F2L Practice",
        description: "Solve 10 F2L pairs to sharpen your recognition and lookahead.",
        progress: 0,
        target: 10,
        xp: 150,
        completed: false
    },
    {
        id: 3,
        title: "PLL Recognition",
        description: "Recognize 15 PLL cases to improve your last-layer recognition.",
        progress: 0,
        target: 15,
        xp: 200,
        completed: false
    }
];



function getCurrentQuest() {

    const currentQuest = quests[currentQuestIndex];
    return currentQuest;
}

function updateProgress() {
    const quest = getCurrentQuest();

    questTitle.textContent = quest.title;
    questXp.textContent = quest.xp;
    progress.textContent = quest.progress;
    questDescription.textContent = quest.description;
    target.textContent = quest.target;
    progressBar.value = quest.progress;
    progressBar.max = quest.target;
    xpValue.textContent = xpValueHolder;
}

function xpValueAdder(amount) {
    xpValueHolder += amount;
}

plus.addEventListener("click", () => {
    const quest = getCurrentQuest();
    
    if (quest.progress < quest.target) {
        quest.progress++;
    }

    if (quest.progress === quest.target) {
        if (quest.completed != true) {
            xpValueAdder(quest.xp);
            quest.completed = true;
        }
        
        if (currentQuestIndex < quests.length - 1) {
            currentQuestIndex++;
        }
    }
    updateProgress();
})

dec.addEventListener("click", () => {
    const quest = getCurrentQuest();

    if (quest.completed === true) {
        return;
    }

    if (quest.progress > 0) {
        quest.progress--;
        updateProgress();
    }
})

updateProgress();