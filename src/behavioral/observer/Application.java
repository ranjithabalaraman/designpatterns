package behavioral.observer;

public class Application {

	public static void main(String[] args) {
		// create subject
		Blog blog = new Blog();

		// create observers
		Observer obj1 = new BlogSubscriber("Obj1");
		Observer obj2 = new BlogSubscriber("Obj2");
		Observer obj3 = new BlogSubscriber("Obj3");

		// register observers to the subject
		blog.register(obj1);
		blog.register(obj2);
		blog.register(obj3);

		// attach observer to subject
		obj1.setSubject(blog);
		obj2.setSubject(blog);
		obj3.setSubject(blog);

		// check if any update is available
		obj1.update();

		// now send message to subject
		blog.postMessage("New Message");

	}

}
