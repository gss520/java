/**
 * 
 */
function trim(str){
	for(var i=0;i<str.length&&str.charAt(i)=="";i++);
	for(var j=str.length;j>0&&str.charAt(j-1)=="";j--);
	if(i>j)return"";
	return str.substring(i,j);
}
