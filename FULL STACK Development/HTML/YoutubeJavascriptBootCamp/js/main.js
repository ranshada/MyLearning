let countEl=document.getElementById("count-el")

let count =0
let text= ""
function increment(){
    console.log("clicked")
    count+=1
countEl.innerHTML=count
}



let saveEL=document.getElementById("welcome-el")

function save(){
    
    text=text+count+"  -   "
    saveEL.textContent=text
    countEl.textContent=0
    count=0
}

