package android.support.v4.widget;

import android.content.Context;
import android.database.Cursor;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public abstract class p
  extends e
{
  private int CH;
  private int CI;
  private LayoutInflater CJ;
  
  public final View newDropDownView(Context paramContext, Cursor paramCursor, ViewGroup paramViewGroup)
  {
    return this.CJ.inflate(this.CI, paramViewGroup, false);
  }
  
  public View newView(Context paramContext, Cursor paramCursor, ViewGroup paramViewGroup)
  {
    return this.CJ.inflate(this.CH, paramViewGroup, false);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\android\support\v4\widget\p.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */