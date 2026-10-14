import java.awt.*;
import java.util.LinkedList;

private Direction NexDirection = Direction.RIGHT;

public void setNextDirection (Direction newDirection) {
    if (isOpposite (newDirection)) {
        return;
    }
    nextDirection = newDirection;
}
private boolean isOpposite (Direction newDirection)
    
    5
}
2
return(direction Direction.UP && newDirection== Direction.DOWN) || (direction Direction.DOWN &&
www
newDirection == Direction.UP) (direction == Direction. LEFT && newDirection == Direction.RIGHT) ||
(direction = Direction.RIGHT && newDirection == Direction. LEFT);
public Point peekNextHead() {
direction nextDirection;
1
2
3
5
body.getFirst(); Point head
Point newHead new Point(head.x, head.y);
swtich (direction) (
case UP: newHead.y--; break;
case DOWN: newHead.y++; break;
case LEFT; newHead.x--; break;
case RIGHT: newHead.x++; break;
ww
}
return newHead;