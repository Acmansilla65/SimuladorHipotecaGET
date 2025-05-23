async function getData(url,respuesta){
    try{
        const response = await fetch(url,{method:"GET"});
        const mensaje = await response.text();
        respuesta.innerHTML = mensaje;
    }
    catch (error){
        console.log("Error", error)
    }
}
window.addEventListener("load",() =>{
    const controller1 = "HipotecaController?"
    const b1 = document.getElementById("b1");
    if (b1){
        b1.addEventListener("click", (event) =>{
            event.preventDefault();
            const datos ={
                I1: document.getElementById("importe").value,
                C1: document.getElementById("capital").value,
                T1: document.getElementById("duracion").value
            }
            const respuesta = document.querySelector("#mensaje");
            const params = new URLSearchParams(datos);
            const url1 = controller1 + params;
            getData(url1,respuesta)
        });
    }
});