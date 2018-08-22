const postAddButton = document.querySelector('.add-post button');
const postAddInput = document.querySelector('.add-post input');
const postsList = document.querySelector('.posts-list p');

const xhr = new XMLHttpRequest()
xhr.onreadystatechange = function(){
	if(xhr.readyState===4 && xhr.status === 200) {
		const res = xhr.responseText
		postsList.innerHTML = res
	}
}

postAddButton.addEventListener('click', function() {
	postPost(postAddInput.value)
	postAddInput.value = ""
})

function postPost(content) {
	xhr.open('POST', '/admin/posts/' + content, true)
	xhr.send()
}