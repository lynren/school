---
title: 'Advanced Web Design: Assignment 4'
author:
- Lyndon Renaud
- 104 556 776
geometry: margin=2.5cm, top=2cm
...
### a: From main.html or recipes.html, Copy and paste the full meta element that is required for the browser to turn on the responsive mode.
```<meta name="viewport" content="width=device-width, initial-scale=1.0">```

### b: From responsive_solution.css file, what is the width of three cols ( col#1,col#2,col#3) width for the devices that has resolution <500 pixels.
```width: 100%;```

### c: From responsive_solution.css file, what is the width of three cols ( col#1,col#2,col#3) width for the devices that has resolution >500 pixels.
```table
---
markdown: True
align: L
---
**Column**, **Width**
col1, width: 43%
col2, width: 43%
col3, width: 90%
```

### d: From main.css, copy all the style rules for the menu
```
nav ul {
	margin: 0;
	padding: 0;
	}

nav ul li {
	list-style: none;
	float: left;
	font-size: 93%;
}

nav ul li a {
	display: block;
	font-weight: bold;
	padding: .625em 3.5em; /* 10px 15px */
	text-decoration: none;
	color: #000;
	border-right: 1px solid #bababa;
}
```
