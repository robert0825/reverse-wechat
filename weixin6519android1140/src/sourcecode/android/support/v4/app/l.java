package android.support.v4.app;

import android.os.Bundle;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.List;

public abstract class l
{
  public abstract Fragment E(int paramInt);
  
  public abstract void F(int paramInt);
  
  public abstract void a(Bundle paramBundle, String paramString, Fragment paramFragment);
  
  public abstract p aV();
  
  public abstract List<Fragment> aW();
  
  public abstract Fragment c(Bundle paramBundle, String paramString);
  
  public abstract void dump(String paramString, FileDescriptor paramFileDescriptor, PrintWriter paramPrintWriter, String[] paramArrayOfString);
  
  public abstract Fragment.SavedState e(Fragment paramFragment);
  
  public abstract boolean executePendingTransactions();
  
  public abstract boolean isDestroyed();
  
  public abstract Fragment l(String paramString);
  
  public abstract void popBackStack();
  
  public abstract boolean popBackStackImmediate();
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\android\support\v4\app\l.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */