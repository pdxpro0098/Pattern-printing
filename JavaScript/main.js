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

hollowSquare(5);