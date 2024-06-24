for(i=0;i<document.querySelectorAll(".drum").length;i++){
document.querySelectorAll(".drum")[i].addEventListener("click", handleClick);
}    

function handleClick(){
    var buttonInnerHTML=this.innerHTML;
    makeSound(buttonInnerHTML);
    makeAnimation(buttonInnerHTML);
}

document.addEventListener("keydown", function() {
    makeSound(event.key)
    makeAnimation(event.key);
});





function makeSound(key){
    if(key=="w"){
        var audio=new Audio("sounds/crash.mp3");
    audio.play();
    }
    else if(key=="a"){
        var audio=new Audio("sounds/kick-bass.mp3");
        audio.play();
    }else if(key=="s"){
        var audio=new Audio("sounds/snare.mp3");
        audio.play();
    }else if(key=="d"){
        var audio=new Audio("sounds/tom-1.mp3");
        audio.play();
    }else if(key=="j"){
        var audio=new Audio("sounds/tom-2.mp3");
        audio.play();
    }
    else if(key=="k"){
        var audio=new Audio("sounds/tom-3.mp3");
        audio.play();
    }
    else if(key=="l"){
        var audio=new Audio("sounds/tom-4.mp3");
        audio.play();
    }
}

function makeAnimation(currentKey){

var but= document.querySelector("."+currentKey);
but.classList.add("pressed");

setTimeout(function(){

but.classList.remove("pressed");

}, 100);
}