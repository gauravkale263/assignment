function reverseString(str) {

    let str1=str.split(" ")
    const reversed = str1.map(data => {
            return data.split('').reverse().join("");
    });
    console.log(reversed.join(" "))
}
let str="Hello I am Gaurav Kale";
reverseString(str);
