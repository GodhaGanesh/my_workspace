const periodicTable = [
    { name: "Hydrogen", symbol: "H", atomicNumber: 1, atomicWeight: 1.008 },
    { name: "Helium", symbol: "He", atomicNumber: 2, atomicWeight: 4.0026 },
    { name: "Lithium", symbol: "Li", atomicNumber: 3, atomicWeight: 6.94 },
    { name: "Beryllium", symbol: "Be", atomicNumber: 4, atomicWeight: 9.0122 },
    { name: "Boron", symbol: "B", atomicNumber: 5, atomicWeight: 10.81 },
    { name: "Carbon", symbol: "C", atomicNumber: 6, atomicWeight: 12.011 },
    { name: "Nitrogen", symbol: "N", atomicNumber: 7, atomicWeight: 14.007 },
    { name: "Oxygen", symbol: "O", atomicNumber: 8, atomicWeight: 15.999 },
    { name: "Fluorine", symbol: "F", atomicNumber: 9, atomicWeight: 18.998 },
    { name: "Neon", symbol: "Ne", atomicNumber: 10, atomicWeight: 20.18 },
    { name: "Sodium", symbol: "Na", atomicNumber: 11, atomicWeight: 22.99 },
    { name: "Magnesium", symbol: "Mg", atomicNumber: 12, atomicWeight: 24.305 },
    { name: "Aluminum", symbol: "Al", atomicNumber: 13, atomicWeight: 26.982 },
    { name: "Silicon", symbol: "Si", atomicNumber: 14, atomicWeight: 28.085 },
    { name: "Phosphorus", symbol: "P", atomicNumber: 15, atomicWeight: 30.974 },
    { name: "Sulfur", symbol: "S", atomicNumber: 16, atomicWeight: 32.06 },
    { name: "Chlorine", symbol: "Cl", atomicNumber: 17, atomicWeight: 35.45 },
    { name: "Argon", symbol: "Ar", atomicNumber: 18, atomicWeight: 39.948 },
    { name: "Potassium", symbol: "K", atomicNumber: 19, atomicWeight: 39.098 },
    { name: "Calcium", symbol: "Ca", atomicNumber: 20, atomicWeight: 40.078 },
    { name: "Scandium", symbol: "Sc", atomicNumber: 21, atomicWeight: 44.9559 },
    { name: "Titanium", symbol: "Ti", atomicNumber: 22, atomicWeight: 47.867 },
    { name: "Vanadium", symbol: "V", atomicNumber: 23, atomicWeight: 50.9415 },
    { name: "Chromium", symbol: "Cr", atomicNumber: 24, atomicWeight: 51.9961 },
    { name: "Manganese", symbol: "Mn", atomicNumber: 25, atomicWeight: 54.938 },
    { name: "Iron", symbol: "Fe", atomicNumber: 26, atomicWeight: 55.845 },
    { name: "Cobalt", symbol: "Co", atomicNumber: 27, atomicWeight: 58.933 },
    { name: "Nickel", symbol: "Ni", atomicNumber: 28, atomicWeight: 58.693 },
    { name: "Copper", symbol: "Cu", atomicNumber: 29, atomicWeight: 63.546 },
    { name: "Zinc", symbol: "Zn", atomicNumber: 30, atomicWeight: 65.38 },
    { name: "Gallium", symbol: "Ga", atomicNumber: 31, atomicWeight: 69.723 },
    { name: "Germanium", symbol: "Ge", atomicNumber: 32, atomicWeight: 72.63 },
    { name: "Arsenic", symbol: "As", atomicNumber: 33, atomicWeight: 74.9216 },
    { name: "Selenium", symbol: "Se", atomicNumber: 34, atomicWeight: 78.971 },
    { name: "Bromine", symbol: "Br", atomicNumber: 35, atomicWeight: 79.904 },
    { name: "Krypton", symbol: "Kr", atomicNumber: 36, atomicWeight: 83.798 },
    { name: "Rubidium", symbol: "Rb", atomicNumber: 37, atomicWeight: 85.4678 },
    { name: "Strontium", symbol: "Sr", atomicNumber: 38, atomicWeight: 87.62 },
    { name: "Yttrium", symbol: "Y", atomicNumber: 39, atomicWeight: 88.9058 },
    { name: "Zirconium", symbol: "Zr", atomicNumber: 40, atomicWeight: 91.224 },
    { name: "Niobium", symbol: "Nb", atomicNumber: 41, atomicWeight: 92.9064 },
    { name: "Molybdenum", symbol: "Mo", atomicNumber: 42, atomicWeight: 95.95 },
    { name: "Technetium", symbol: "Tc", atomicNumber: 43, atomicWeight: 98 },
    { name: "Ruthenium", symbol: "Ru", atomicNumber: 44, atomicWeight: 101.07 },
    { name: "Rhodium", symbol: "Rh", atomicNumber: 45, atomicWeight: 102.9055 },
    { name: "Palladium", symbol: "Pd", atomicNumber: 46, atomicWeight: 106.42 },
    { name: "Silver", symbol: "Ag", atomicNumber: 47, atomicWeight: 107.8682 },
    { name: "Cadmium", symbol: "Cd", atomicNumber: 48, atomicWeight: 112.414 },
    { name: "Indium", symbol: "In", atomicNumber: 49, atomicWeight: 114.818 },
    { name: "Tin", symbol: "Sn", atomicNumber: 50, atomicWeight: 118.71 },
    { name: "Antimony", symbol: "Sb", atomicNumber: 51, atomicWeight: 121.76 },
    { name: "Tellurium", symbol: "Te", atomicNumber: 52, atomicWeight: 127.6 },
    { name: "Iodine", symbol: "I", atomicNumber: 53, atomicWeight: 126.9045 },
    { name: "Xenon", symbol: "Xe", atomicNumber: 54, atomicWeight: 131.293 },
    { name: "Cesium", symbol: "Cs", atomicNumber: 55, atomicWeight: 132.9055 },
    { name: "Barium", symbol: "Ba", atomicNumber: 56, atomicWeight: 137.327 },
    { name: "Lanthanum", symbol: "La", atomicNumber: 57, atomicWeight: 138.9055 },
    { name: "Hafnium", symbol: "Hf", atomicNumber: 72, atomicWeight: 178.49 },
    { name: "Tantalum", symbol: "Ta", atomicNumber: 73, atomicWeight: 180.9479 },
    { name: "Tungsten", symbol: "W", atomicNumber: 74, atomicWeight: 183.84 },
    { name: "Rhenium", symbol: "Re", atomicNumber: 75, atomicWeight: 186.207 },
    { name: "Osmium", symbol: "Os", atomicNumber: 76, atomicWeight: 190.23 },
    { name: "Iridium", symbol: "Ir", atomicNumber: 77, atomicWeight: 192.217 },
    { name: "Platinum", symbol: "Pt", atomicNumber: 78, atomicWeight: 195.084 },
    { name: "Gold", symbol: "Au", atomicNumber: 79, atomicWeight: 196.9665 },
    { name: "Mercury", symbol: "Hg", atomicNumber: 80, atomicWeight: 200.592 },
    { name: "Thallium", symbol: "Tl", atomicNumber: 81, atomicWeight: 204.38 },
    { name: "Lead", symbol: "Pb", atomicNumber: 82, atomicWeight: 207.2 },
    { name: "Bismuth", symbol: "Bi", atomicNumber: 83, atomicWeight: 208.9804 },
    { name: "Polonium", symbol: "Po", atomicNumber: 84, atomicWeight: 209 },
    { name: "Astatine", symbol: "At", atomicNumber: 85, atomicWeight: 210 },
    { name: "Radon", symbol: "Rn", atomicNumber: 86, atomicWeight: 222 },
    { name: "Francium", symbol: "Fr", atomicNumber: 87, atomicWeight: 223 },
    { name: "Radium", symbol: "Ra", atomicNumber: 88, atomicWeight: 226 },
    { name: "Actinium", symbol: "Ac", atomicNumber: 89, atomicWeight: 227 },
    { name: "Rutherfordium", symbol: "Rf", atomicNumber: 104, atomicWeight: 267 },
    { name: "Dubnium", symbol: "Db", atomicNumber: 105, atomicWeight: 270 },
    { name: "Seaborgium", symbol: "Sg", atomicNumber: 106, atomicWeight: 271 },
    { name: "Bohrium", symbol: "Bh", atomicNumber: 107, atomicWeight: 270 },
    { name: "Hassium", symbol: "Hs", atomicNumber: 108, atomicWeight: 277 },
    { name: "Meitnerium", symbol: "Mt", atomicNumber: 109, atomicWeight: 278 },
    { name: "Darmstadtium", symbol: "Ds", atomicNumber: 110, atomicWeight: 281 },
    { name: "Roentgenium", symbol: "Rg", atomicNumber: 111, atomicWeight: 282 },
    { name: "Copernicium", symbol: "Cn", atomicNumber: 112, atomicWeight: 285 },
    { name: "Nihonium", symbol: "Nh", atomicNumber: 113, atomicWeight: 286 },
    { name: "Flerovium", symbol: "Fl", atomicNumber: 114, atomicWeight: 289 },
    { name: "Moscovium", symbol: "Mc", atomicNumber: 115, atomicWeight: 290 },
    { name: "Livermorium", symbol: "Lv", atomicNumber: 116, atomicWeight: 293 },
    { name: "Tennessine", symbol: "Ts", atomicNumber: 117, atomicWeight: 294 },
    { name: "Oganesson", symbol: "Og", atomicNumber: 118, atomicWeight: 294 },
    { name: "Cerium", symbol: "Ce", atomicNumber: 58, atomicWeight: 140.116 },
    { name: "Praseodymium", symbol: "Pr", atomicNumber: 59, atomicWeight: 140.9077 },
    { name: "Neodymium", symbol: "Nd", atomicNumber: 60, atomicWeight: 144.242 },
    { name: "Promethium", symbol: "Pm", atomicNumber: 61, atomicWeight: 145 },
    { name: "Samarium", symbol: "Sm", atomicNumber: 62, atomicWeight: 150.36 },
    { name: "Europium", symbol: "Eu", atomicNumber: 63, atomicWeight: 151.964 },
    { name: "Gadolinium", symbol: "Gd", atomicNumber: 64, atomicWeight: 157.25 },
    { name: "Terbium", symbol: "Tb", atomicNumber: 65, atomicWeight: 158.9254 },
    { name: "Dysprosium", symbol: "Dy", atomicNumber: 66, atomicWeight: 162.5 },
    { name: "Holmium", symbol: "Ho", atomicNumber: 67, atomicWeight: 164.9303 },
    { name: "Erbium", symbol: "Er", atomicNumber: 68, atomicWeight: 167.259 },
    { name: "Thulium", symbol: "Tm", atomicNumber: 69, atomicWeight: 168.9342 },
    { name: "Ytterbium", symbol: "Yb", atomicNumber: 70, atomicWeight: 173.045 },
    { name: "Lutetium", symbol: "Lu", atomicNumber: 71, atomicWeight: 174.9668 },
    { name: "Thorium", symbol: "Th", atomicNumber: 90, atomicWeight: 232.0377 },
    { name: "Protactinium", symbol: "Pa", atomicNumber: 91, atomicWeight: 231.0359 },
    { name: "Uranium", symbol: "U", atomicNumber: 92, atomicWeight: 238.0289 },
    { name: "Neptunium", symbol: "Np", atomicNumber: 93, atomicWeight: 237 },
    { name: "Plutonium", symbol: "Pu", atomicNumber: 94, atomicWeight: 244 },
    { name: "Americium", symbol: "Am", atomicNumber: 95, atomicWeight: 243 },
    { name: "Curium", symbol: "Cm", atomicNumber: 96, atomicWeight: 247 },
    { name: "Berkelium", symbol: "Bk", atomicNumber: 97, atomicWeight: 247 },
    { name: "Californium", symbol: "Cf", atomicNumber: 98, atomicWeight: 251 },
    { name: "Einsteinium", symbol: "Es", atomicNumber: 99, atomicWeight: 252 },
    { name: "Fermium", symbol: "Fm", atomicNumber: 100, atomicWeight: 257 },
    { name: "Mendelevium", symbol: "Md", atomicNumber: 101, atomicWeight: 258 },
    { name: "Nobelium", symbol: "No", atomicNumber: 102, atomicWeight: 259 },
    { name: "Lawrencium", symbol: "Lr", atomicNumber: 103, atomicWeight: 266 }
];


let elements = document.getElementsByClassName('element');
let element = document.getElementById('element');
for (let i = 0; i < elements.length; i++) {

    //for Element atomic number
    let atomicNumber = document.createElement('span');
    atomicNumber.className = 'atomic-number';
    atomicNumber.textContent = periodicTable[i].atomicNumber;
    elements[i].appendChild(atomicNumber);

    //for Element Symbol
    let symbol = document.createElement('div');
    symbol.className = 'symbol';
    symbol.textContent = periodicTable[i].symbol;
    elements[i].appendChild(symbol);

    //for Element Name
    let name = document.createElement('span');
    name.className = 'element-name';
    name.textContent = periodicTable[i].name;
    elements[i].appendChild(name);

    //for Element Atomic Weight
    let atomicWeight = document.createElement('span');
    atomicWeight.className = 'atomic-weight';
    atomicWeight.textContent = periodicTable[i].atomicWeight;
    elements[i].appendChild(atomicWeight);
}

function highlight(classes) {
    let select = classes[1];
    let remainingClasses = document.getElementsByClassName(classes[0]);
    let selectedElements = document.getElementsByClassName(select);

    for (let i = 0; i < elements.length; i++) {
        elements[i].classList.remove('highlighted');
    }

    for (let i = 0; i < remainingClasses.length; i++) {
        remainingClasses[i].classList.remove('highlighted');
    }

    for (let i = 0; i < selectedElements.length; i++) {
        selectedElements[i].classList.add('highlighted');
    }
}


function dehighlight() {

    for (let i = 0; i < elements.length; i++) {
        elements[i].classList.remove('highlighted');
    }
    
    let categories = document.getElementsByClassName('color-box');
    for (let i = 0; i < categories.length; i++) {
        categories[i].classList.remove('highlighted');
    }
}

document.querySelectorAll('.element').forEach(function(td) {
        td.addEventListener('click', function() {
            const classes = Array.from(td.classList).filter(c => c !== 'element');
            document.getElementById('element-name').innerHTML = `<div class="displayElement">${td.outerHTML}</div>`;
            let type = classes.length ? classes[0].replace(/-/g, ' ') : 'Unknown';
            // Find the element in the periodicTable array by symbol
            const symbol = td.querySelector('.symbol')?.textContent;
            const elementData = periodicTable.find(e => e.symbol === symbol);

            document.getElementById('element-info').innerHTML = elementData
                ? `<p>Element type:  ${type.charAt(0).toUpperCase() + type.slice(1)}</p>
                   <p>Atomic Number: ${elementData.atomicNumber}</p>
                   <p>Symbol: ${elementData.symbol}</p>
                   <p>Atomic Mass: ${elementData.atomicWeight}</p>`
                : `<p>Element type:  ${type.charAt(0).toUpperCase() + type.slice(1)}</p>
                   <p>Atomic Number: N/A</p>
                   <p>Symbol: N/A</p>
                   <p>Atomic Mass: N/A</p>`;
        });
    });