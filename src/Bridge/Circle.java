package Bridge;

/**
 * Created by Zengzehao on 2016/9/24.
 */
public class Circle extends AbstractShape {
    public Circle(Color color) {
        super(color);
    }

    @Override
    public void draw() {
        System.out.println("使用"+color.getColor()+"画圆形");
    }
}
