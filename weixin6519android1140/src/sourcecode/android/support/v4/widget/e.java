package android.support.v4.widget;

import android.content.Context;
import android.database.ContentObserver;
import android.database.Cursor;
import android.database.DataSetObserver;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Filter;
import android.widget.FilterQueryProvider;
import android.widget.Filterable;

public abstract class e
  extends BaseAdapter
  implements f.a, Filterable
{
  protected boolean AC;
  protected boolean AD;
  public Cursor AE;
  protected int AF;
  protected a AG;
  protected DataSetObserver AH;
  protected f AI;
  protected FilterQueryProvider AJ;
  public Context mContext;
  
  public abstract void a(View paramView, Cursor paramCursor);
  
  public void changeCursor(Cursor paramCursor)
  {
    if (paramCursor == this.AE) {
      paramCursor = null;
    }
    for (;;)
    {
      if (paramCursor != null) {
        paramCursor.close();
      }
      return;
      Cursor localCursor = this.AE;
      if (localCursor != null)
      {
        if (this.AG != null) {
          localCursor.unregisterContentObserver(this.AG);
        }
        if (this.AH != null) {
          localCursor.unregisterDataSetObserver(this.AH);
        }
      }
      this.AE = paramCursor;
      if (paramCursor != null)
      {
        if (this.AG != null) {
          paramCursor.registerContentObserver(this.AG);
        }
        if (this.AH != null) {
          paramCursor.registerDataSetObserver(this.AH);
        }
        this.AF = paramCursor.getColumnIndexOrThrow("_id");
        this.AC = true;
        notifyDataSetChanged();
        paramCursor = localCursor;
      }
      else
      {
        this.AF = -1;
        this.AC = false;
        notifyDataSetInvalidated();
        paramCursor = localCursor;
      }
    }
  }
  
  public CharSequence convertToString(Cursor paramCursor)
  {
    if (paramCursor == null) {
      return "";
    }
    return paramCursor.toString();
  }
  
  public int getCount()
  {
    if ((this.AC) && (this.AE != null)) {
      return this.AE.getCount();
    }
    return 0;
  }
  
  public final Cursor getCursor()
  {
    return this.AE;
  }
  
  public View getDropDownView(int paramInt, View paramView, ViewGroup paramViewGroup)
  {
    if (this.AC)
    {
      this.AE.moveToPosition(paramInt);
      View localView = paramView;
      if (paramView == null) {
        localView = newDropDownView(this.mContext, this.AE, paramViewGroup);
      }
      a(localView, this.AE);
      return localView;
    }
    return null;
  }
  
  public Filter getFilter()
  {
    if (this.AI == null) {
      this.AI = new f(this);
    }
    return this.AI;
  }
  
  public Object getItem(int paramInt)
  {
    if ((this.AC) && (this.AE != null))
    {
      this.AE.moveToPosition(paramInt);
      return this.AE;
    }
    return null;
  }
  
  public long getItemId(int paramInt)
  {
    long l2 = 0L;
    long l1 = l2;
    if (this.AC)
    {
      l1 = l2;
      if (this.AE != null)
      {
        l1 = l2;
        if (this.AE.moveToPosition(paramInt)) {
          l1 = this.AE.getLong(this.AF);
        }
      }
    }
    return l1;
  }
  
  public View getView(int paramInt, View paramView, ViewGroup paramViewGroup)
  {
    if (!this.AC) {
      throw new IllegalStateException("this should only be called when the cursor is valid");
    }
    if (!this.AE.moveToPosition(paramInt)) {
      throw new IllegalStateException("couldn't move cursor to position " + paramInt);
    }
    View localView = paramView;
    if (paramView == null) {
      localView = newView(this.mContext, this.AE, paramViewGroup);
    }
    a(localView, this.AE);
    return localView;
  }
  
  public boolean hasStableIds()
  {
    return true;
  }
  
  public View newDropDownView(Context paramContext, Cursor paramCursor, ViewGroup paramViewGroup)
  {
    return newView(paramContext, paramCursor, paramViewGroup);
  }
  
  public abstract View newView(Context paramContext, Cursor paramCursor, ViewGroup paramViewGroup);
  
  protected final void onContentChanged()
  {
    if ((this.AD) && (this.AE != null) && (!this.AE.isClosed())) {
      this.AC = this.AE.requery();
    }
  }
  
  public Cursor runQueryOnBackgroundThread(CharSequence paramCharSequence)
  {
    if (this.AJ != null) {
      return this.AJ.runQuery(paramCharSequence);
    }
    return this.AE;
  }
  
  private final class a
    extends ContentObserver
  {
    public final boolean deliverSelfNotifications()
    {
      return true;
    }
    
    public final void onChange(boolean paramBoolean)
    {
      this.AK.onContentChanged();
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\android\support\v4\widget\e.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */