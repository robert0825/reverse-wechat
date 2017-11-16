package android.support.v4.content;

import android.content.Context;
import java.io.FileDescriptor;
import java.io.PrintWriter;

public class c<D>
{
  Context mContext;
  public int mId;
  public boolean mP = false;
  public b<D> sH;
  public a<D> sI;
  public boolean sJ = false;
  public boolean sK = true;
  public boolean sL = false;
  public boolean sM = false;
  
  public c(Context paramContext)
  {
    this.mContext = paramContext.getApplicationContext();
  }
  
  public final void a(a<D> parama)
  {
    if (this.sI == null) {
      throw new IllegalStateException("No listener register");
    }
    if (this.sI != parama) {
      throw new IllegalArgumentException("Attempting to unregister the wrong listener");
    }
    this.sI = null;
  }
  
  public final void a(b<D> paramb)
  {
    if (this.sH == null) {
      throw new IllegalStateException("No listener register");
    }
    if (this.sH != paramb) {
      throw new IllegalArgumentException("Attempting to unregister the wrong listener");
    }
    this.sH = null;
  }
  
  public final void deliverResult(D paramD)
  {
    if (this.sH != null) {
      this.sH.b(this, paramD);
    }
  }
  
  public void dump(String paramString, FileDescriptor paramFileDescriptor, PrintWriter paramPrintWriter, String[] paramArrayOfString)
  {
    paramPrintWriter.print(paramString);
    paramPrintWriter.print("mId=");
    paramPrintWriter.print(this.mId);
    paramPrintWriter.print(" mListener=");
    paramPrintWriter.println(this.sH);
    if ((this.mP) || (this.sL) || (this.sM))
    {
      paramPrintWriter.print(paramString);
      paramPrintWriter.print("mStarted=");
      paramPrintWriter.print(this.mP);
      paramPrintWriter.print(" mContentChanged=");
      paramPrintWriter.print(this.sL);
      paramPrintWriter.print(" mProcessingChange=");
      paramPrintWriter.println(this.sM);
    }
    if ((this.sJ) || (this.sK))
    {
      paramPrintWriter.print(paramString);
      paramPrintWriter.print("mAbandoned=");
      paramPrintWriter.print(this.sJ);
      paramPrintWriter.print(" mReset=");
      paramPrintWriter.println(this.sK);
    }
  }
  
  public void onReset() {}
  
  public void onStartLoading() {}
  
  public void onStopLoading() {}
  
  public String toString()
  {
    StringBuilder localStringBuilder = new StringBuilder(64);
    android.support.v4.e.c.a(this, localStringBuilder);
    localStringBuilder.append(" id=");
    localStringBuilder.append(this.mId);
    localStringBuilder.append("}");
    return localStringBuilder.toString();
  }
  
  public static abstract interface a<D> {}
  
  public static abstract interface b<D>
  {
    public abstract void b(c<D> paramc, D paramD);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\android\support\v4\content\c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */