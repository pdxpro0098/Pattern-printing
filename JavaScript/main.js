function solidSquare(line) {
    for (let i = 0; i < line; i++) {
        let row = "";
        for (let j = 0; j < line; j++) {
            row += "*";
        }
        console.log(row);
    }
}

solidSquare(5);