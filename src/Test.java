public class Test
{
  public static void main(String[] args)
  {
    Buffer<String> buffer = new SynchronizedQueue<>(5);
    buffer.put("Yes");
    System.out.println(buffer);
  }
}
