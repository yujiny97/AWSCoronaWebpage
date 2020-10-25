app.get('/aws/corona',function(req,res){
	var data=req.query.data;
	console.log('GET paramter= ' + data);
	
	var res=data+ 'Success';
	console.log(res);
	res.send({result:res});
});