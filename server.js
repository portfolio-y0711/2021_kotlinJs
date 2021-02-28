const express = require('express');
const app = express();
const port = 4000;
const path = require('path');

app.use(express.static(path.join(__dirname, "build")));
app.get('/', (req, res) => {
    res.send('server')
});

app.listen(port, () => {
    console.log(`server listenening on ${port}`);
})