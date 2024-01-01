var express = require('express');
var app = express();

app.use('/', express.static('./', {index: 'index.html'}));
app.use('/img', express.static('/img'));
app.use('/js', express.static('../target/scala-3.2.0/pixijs-fastopt'));


app.listen(3000, () => console.log("listen on port http://localhost:3000"));
