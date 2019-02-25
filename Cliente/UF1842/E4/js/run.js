var body = document.querySelector('body'),
	charSVG = document.querySelector('.char-svg'),
	position = 0, 
	delta = 0;

function charAction(action) {
	if(action == 'stand')
		charSVG.className = 'char-svg';
	else if(action == 'walk')
		charSVG.className = 'char-svg walk';
	else if(action == 'run')
		charSVG.className = 'char-svg run';
	else if(action == 'crouch')
		charSVG.className = 'char-svg crouch';
	else if(action == 'jump')
		charSVG.className = 'char-svg jump';
	else if(action == 'jumpUp')
		charSVG.className = 'char-svg jumpUp';
	else if(action == 'jumpDown')
		charSVG.className = 'char-svg jumpDown';

	// for background
	if(action == 'walk' || action == 'jump')
		delta = -2;
	else if(action == 'run')
		delta = -6;
	else
		delta = 0;
}

function moveBackground() {
	position += delta;
	body.style.backgroundPositionX = `${position}px`;
	requestAnimationFrame(moveBackground);
}

requestAnimationFrame(moveBackground);