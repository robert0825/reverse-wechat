package android.support.v4.app;

import android.app.RemoteInput;
import android.content.ClipData;
import android.content.ClipData.Item;
import android.content.ClipDescription;
import android.content.Intent;
import android.os.Build.VERSION;
import android.os.Bundle;

public final class ag
  extends ai.a
{
  private static final b su;
  public static final ai.a.a sv;
  private final Bundle mExtras;
  private final String sq;
  private final CharSequence sr;
  private final CharSequence[] ss;
  private final boolean st;
  
  static
  {
    if (Build.VERSION.SDK_INT >= 20) {
      su = new c();
    }
    for (;;)
    {
      sv = new ai.a.a() {};
      return;
      if (Build.VERSION.SDK_INT >= 16) {
        su = new e();
      } else {
        su = new d();
      }
    }
  }
  
  public ag(String paramString, CharSequence paramCharSequence, CharSequence[] paramArrayOfCharSequence, boolean paramBoolean, Bundle paramBundle)
  {
    this.sq = paramString;
    this.sr = paramCharSequence;
    this.ss = paramArrayOfCharSequence;
    this.st = paramBoolean;
    this.mExtras = paramBundle;
  }
  
  public static Bundle getResultsFromIntent(Intent paramIntent)
  {
    return su.getResultsFromIntent(paramIntent);
  }
  
  public final boolean getAllowFreeFormInput()
  {
    return this.st;
  }
  
  public final CharSequence[] getChoices()
  {
    return this.ss;
  }
  
  public final Bundle getExtras()
  {
    return this.mExtras;
  }
  
  public final CharSequence getLabel()
  {
    return this.sr;
  }
  
  public final String getResultKey()
  {
    return this.sq;
  }
  
  public static final class a
  {
    public Bundle mExtras = new Bundle();
    public final String sq;
    public CharSequence sr;
    public CharSequence[] ss;
    public boolean st = true;
    
    public a(String paramString)
    {
      this.sq = paramString;
    }
  }
  
  static abstract interface b
  {
    public abstract Bundle getResultsFromIntent(Intent paramIntent);
  }
  
  static final class c
    implements ag.b
  {
    public final Bundle getResultsFromIntent(Intent paramIntent)
    {
      return RemoteInput.getResultsFromIntent(paramIntent);
    }
  }
  
  static final class d
    implements ag.b
  {
    public final Bundle getResultsFromIntent(Intent paramIntent)
    {
      return null;
    }
  }
  
  static final class e
    implements ag.b
  {
    public final Bundle getResultsFromIntent(Intent paramIntent)
    {
      paramIntent = paramIntent.getClipData();
      if (paramIntent != null)
      {
        ClipDescription localClipDescription = paramIntent.getDescription();
        if ((localClipDescription.hasMimeType("text/vnd.android.intent")) && (localClipDescription.getLabel().equals("android.remoteinput.results"))) {
          return (Bundle)paramIntent.getItemAt(0).getIntent().getExtras().getParcelable("android.remoteinput.resultsData");
        }
      }
      return null;
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\android\support\v4\app\ag.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */