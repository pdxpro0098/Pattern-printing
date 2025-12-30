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

function rightHalfTriangle(line) {
    let pattern = "";
    for (let i = 0; i < line; i++) {
        for (let j = 0; j < i + 1; j++) {
            pattern += "*";
        }
        pattern += "\n";
    }
    console.log(pattern);
}

function leftHalfTriangle(line) {
    let pattern = "";
    for (let i = 0; i < line; i++) {
        for (let j = line; j > i; j--) {
            pattern += " ";
        }
        for (let j = 0; j < i + 1; j++) {
            pattern += "*";
        }
        pattern += "\n";
    }
    console.log(pattern);
}

function invertedRightHalfTriangle(line) {
    let pattern = "";
    for (let i = line; i >= 0; i--) {
        for (let j = i - 1; j >= 0; j--) {
            pattern += "*";
        }
        pattern += "\n";
    }
    console.log(pattern);
}

function invertedLeftHalfTriangle(line) {
    let pattern = "";
    for (let i = 0; i < line; i++) {
        for (let j = 0; j < i + 1; j++) {
            pattern += " ";
        }
        for (let j = line; j > i; j--) {
            pattern += "*";
        }
        pattern += "\n";
    }
    console.log(pattern);
}

function floydTriangle(line) {
    let pattern = "";
    let num = 1;
    for (let i = 0; i < line; i++) {
        for (let j = 0; j < i + 1; j++) {
            pattern += num + " ";
            num++;
        }
        pattern += "\n";
    }
    console.log(pattern);

}

function pascalTriangle(line) {
    let pattern = "";
    function factorial(num) {
        let fact = 1
        for (let i = 1; i < num; i++) {
            fact = fact * i
        }
        return String(fact);
    }

    function nCr(n, r) {
        return String(factorial(n) / (factorial(r) * factorial(n - r)));
    }

    for (let i = 0; i < line; i++) {
        for (let j = line; j > i; j--) {
            pattern += " ";
        }
        for (let k = 0; k <= i; k++) {
            pattern += `${nCr(i, k)}` + " ";
        }
        pattern += "\n";
    }
    console.log(pattern);
}

function binaryTriangle(line) {
    let pattern = "";
    for (let i = 0; i < line; i++) {
        for (let j = 0; j < i + 1; j++) {
            if ((i + j) % 2 == 0) {
                pattern += "0";
            }
            else {
                pattern += "1";
            }
        }
        pattern += "\n";
    }
    console.log(pattern);
}

function pyramid(line) {
    let pattern = "";
    for (let i = 0; i < line; i++) {
        for (let j = line; j > i; j--) {
            pattern += " ";
        }
        for (let j = 0; j < i + 1; j++) {
            pattern += "*";
        }
        for (let j = 1; j < i + 1; j++) {
            pattern += "*";
        }
        pattern += "\n"
    }
    console.log(pattern);
}

function invertedPyramid(line) {
    let pattern = "";
    for (let i = 0; i < line; i++) {
        for (let j = 0; j < i; j++) {
            pattern += "_";
        }
        for (let j = line; j > i + 1; j--) {
            pattern += "*";
        }
        for (let j = line; j > i; j--) {
            pattern += "*";
        }
        pattern += "\n"
    }
    console.log(pattern);
}

function hollowPyramid(line) {
    let pattern = "";
    for (let i = 0; i < line; i++) {
        for (let j = line; j > i; j--) {
            pattern += " "
        }
        pattern += "*"

        for (let j = 1; j < i * 2 + 1; j++) {
            if (j == i * 2 || i == line - 1) {
                pattern += "*"
            }
            else {
                pattern += " "
            }
        }
        pattern += "\n"
    }
    console.log(pattern);
}

function invertedHollowPyramid(line) {
    let pattern = "";

    for (let i = 0; i < line; i++) {
        for (let j = 0; j < 2 * i + 1; j++) {
            pattern += " ";
        }
        for (let k = 0; k < 2 * (line - i) - 1; k++) {
            if (k == 0 || k == 2 * (line - i) - 2 || i == 0)
                pattern += "* ";
            else
                pattern += "  ";
        }
        pattern += "\n";
    }
    console.log(pattern);
}

function diamond(line) {
    let pattern = "";
    for (let i = 0; i < line; i++) {
        for (let j = line; j > i; j--) {
            pattern += " ";
        }
        for (let j = 0; j < i; j++) {
            pattern += "*";
        }
        for (let j = 1; j < i; j++) {
            pattern += "*";
        }
        pattern += ("\n");
    }
    for (let i = 0; i < line; i++) {
        for (let j = 0; j < i; j++) {
            pattern += " ";
        }
        for (let j = line; j > i; j--) {
            pattern += "*";
        }
        for (let j = line - 1; j > i; j--) {
            pattern += "*";
        }
        pattern += "\n";
    }
    console.log(pattern);
}


function hollowDiamond(line) {
    let pattern = "";
    for (let i = 0; i < line; i++) {
        for (let j = line; j > i; j--) {
            pattern += " ";
        }
        for (let j = 0; j < i; j++) {
            if (j == 0) {
                pattern += "*";
            }
            else {
                pattern += " ";
            }
        }
        for (let j = 1; j < i; j++) {
            if ((j + 1) == i) {
                pattern += "*";
            }
            else {
                pattern += " ";
            }
        }
        pattern += "\n";

    }
    for (let i = 0; i < line; i++) {
        for (let j = 0; j < i; j++) {
            pattern += " ";

        }
        for (let j = line; j > i; j--) {
            if (j == 5) {
                pattern += "*";

            }
            else {
                pattern += " ";

            }
        }
        for (let j = line - 1; j > i; j--) {
            if (j == (i + 1)) {
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

hollowDiamond(5);