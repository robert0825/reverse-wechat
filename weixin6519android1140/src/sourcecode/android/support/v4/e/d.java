package android.support.v4.e;

import java.io.Writer;

public final class d
  extends Writer
{
  private StringBuilder mBuilder = new StringBuilder(128);
  private final String mTag;
  
  public d(String paramString)
  {
    this.mTag = paramString;
  }
  
  private void flushBuilder()
  {
    if (this.mBuilder.length() > 0) {
      this.mBuilder.delete(0, this.mBuilder.length());
    }
  }
  
  public final void close()
  {
    flushBuilder();
  }
  
  public final void flush()
  {
    flushBuilder();
  }
  
  public final void write(char[] paramArrayOfChar, int paramInt1, int paramInt2)
  {
    int i = 0;
    if (i < paramInt2)
    {
      char c = paramArrayOfChar[(paramInt1 + i)];
      if (c == '\n') {
        flushBuilder();
      }
      for (;;)
      {
        i += 1;
        break;
        this.mBuilder.append(c);
      }
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\android\support\v4\e\d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */