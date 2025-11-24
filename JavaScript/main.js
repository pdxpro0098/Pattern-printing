function solidSquare(line) {
    for (let i = 0; i < line; i++) {
        let row = "";
        for (let j = 0; j < line; j++) {
            row += "*";
        }
        console.log(row);
    }
}

function hollowSquare(line) {
    let pattern = "";
    for (let i = 0; i < line; i++) {
        for (let j = 0; j < line; j++) {
            if ((i === 0 || i === line - 1) || (j === 0 || j === line - 1)) {
                pattern += "*";
            }
            else {
                pattern += " ";
            }
        }
        pattern += "\n";
    }
    console.log(pattern);
}

function numberSquare(line) {
    let pattern = "";
    for (let i = 1; i <= line; i++) {
        for (let j = 1; j <= line; j++) {
            pattern += i + "";
        }
        pattern += "\n";
    }
    console.log(pattern);
}

function solidRectangle(row, column) {
    let pattern = "";
    for (let i = 1; i <= row; i++) {
        for (let j = 1; j <= column; j++) {
            pattern += "*";
        }
        pattern += "\n";
    }
    console.log(pattern);
}

function hollowRectangle(row, column) {
    let pattern = "";
    for (let i = 0; i < row; i++) {
        for (let j = 0; j < column; j++) {
            if ((i === 0 || i === row - 1) || (j === 0 || j === column - 1)) {
                pattern += "*";
            }
            else {
                pattern += " ";
            }
        }
        pattern += "\n";
    }
    console.log(pattern);
}

hollowRectangle(3, 5);