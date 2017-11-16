package android.support.v4.app;

import android.content.Context;
import android.content.res.TypedArray;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import android.util.AttributeSet;
import android.view.View.BaseSavedState;
import android.widget.TabHost;
import android.widget.TabHost.OnTabChangeListener;
import java.util.ArrayList;

public class FragmentTabHost
  extends TabHost
  implements TabHost.OnTabChangeListener
{
  private final ArrayList<a> jg = new ArrayList();
  private Context mContext;
  private int oC;
  private l qg;
  private TabHost.OnTabChangeListener qn;
  private a qo;
  private boolean qp;
  
  public FragmentTabHost(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    paramContext = paramContext.obtainStyledAttributes(paramAttributeSet, new int[] { 16842995 }, 0, 0);
    this.oC = paramContext.getResourceId(0, 0);
    paramContext.recycle();
    super.setOnTabChangedListener(this);
  }
  
  private p a(String paramString, p paramp)
  {
    Object localObject = null;
    int i = 0;
    if (i < this.jg.size())
    {
      a locala = (a)this.jg.get(i);
      if (!locala.tag.equals(paramString)) {
        break label213;
      }
      localObject = locala;
    }
    label200:
    label213:
    for (;;)
    {
      i += 1;
      break;
      if (localObject == null) {
        throw new IllegalStateException("No tab known for tag " + paramString);
      }
      paramString = paramp;
      if (this.qo != localObject)
      {
        paramString = paramp;
        if (paramp == null) {
          paramString = this.qg.aV();
        }
        if ((this.qo != null) && (this.qo.nK != null)) {
          paramString.b(this.qo.nK);
        }
        if (localObject != null)
        {
          if (((a)localObject).nK != null) {
            break label200;
          }
          ((a)localObject).nK = Fragment.a(this.mContext, ((a)localObject).qr.getName(), ((a)localObject).qs);
          paramString.a(this.oC, ((a)localObject).nK, ((a)localObject).tag);
        }
      }
      for (;;)
      {
        this.qo = ((a)localObject);
        return paramString;
        paramString.c(((a)localObject).nK);
      }
    }
  }
  
  protected void onAttachedToWindow()
  {
    super.onAttachedToWindow();
    String str = getCurrentTabTag();
    Object localObject1 = null;
    int i = 0;
    if (i < this.jg.size())
    {
      a locala = (a)this.jg.get(i);
      locala.nK = this.qg.l(locala.tag);
      Object localObject2 = localObject1;
      if (locala.nK != null)
      {
        localObject2 = localObject1;
        if (!locala.nK.mDetached)
        {
          if (!locala.tag.equals(str)) {
            break label108;
          }
          this.qo = locala;
          localObject2 = localObject1;
        }
      }
      for (;;)
      {
        i += 1;
        localObject1 = localObject2;
        break;
        label108:
        localObject2 = localObject1;
        if (localObject1 == null) {
          localObject2 = this.qg.aV();
        }
        ((p)localObject2).b(locala.nK);
      }
    }
    this.qp = true;
    localObject1 = a(str, (p)localObject1);
    if (localObject1 != null)
    {
      ((p)localObject1).commit();
      this.qg.executePendingTransactions();
    }
  }
  
  protected void onDetachedFromWindow()
  {
    super.onDetachedFromWindow();
    this.qp = false;
  }
  
  protected void onRestoreInstanceState(Parcelable paramParcelable)
  {
    if (!(paramParcelable instanceof SavedState))
    {
      super.onRestoreInstanceState(paramParcelable);
      return;
    }
    paramParcelable = (SavedState)paramParcelable;
    super.onRestoreInstanceState(paramParcelable.getSuperState());
    setCurrentTabByTag(paramParcelable.qq);
  }
  
  protected Parcelable onSaveInstanceState()
  {
    SavedState localSavedState = new SavedState(super.onSaveInstanceState());
    localSavedState.qq = getCurrentTabTag();
    return localSavedState;
  }
  
  public void onTabChanged(String paramString)
  {
    if (this.qp)
    {
      p localp = a(paramString, null);
      if (localp != null) {
        localp.commit();
      }
    }
    if (this.qn != null) {
      this.qn.onTabChanged(paramString);
    }
  }
  
  public void setOnTabChangedListener(TabHost.OnTabChangeListener paramOnTabChangeListener)
  {
    this.qn = paramOnTabChangeListener;
  }
  
  @Deprecated
  public void setup()
  {
    throw new IllegalStateException("Must call setup() that takes a Context and FragmentManager");
  }
  
  static class SavedState
    extends View.BaseSavedState
  {
    public static final Parcelable.Creator<SavedState> CREATOR = new Parcelable.Creator() {};
    String qq;
    
    private SavedState(Parcel paramParcel)
    {
      super();
      this.qq = paramParcel.readString();
    }
    
    SavedState(Parcelable paramParcelable)
    {
      super();
    }
    
    public String toString()
    {
      return "FragmentTabHost.SavedState{" + Integer.toHexString(System.identityHashCode(this)) + " curTab=" + this.qq + "}";
    }
    
    public void writeToParcel(Parcel paramParcel, int paramInt)
    {
      super.writeToParcel(paramParcel, paramInt);
      paramParcel.writeString(this.qq);
    }
  }
  
  static final class a
  {
    public Fragment nK;
    public final Class<?> qr;
    public final Bundle qs;
    public final String tag;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\android\support\v4\app\FragmentTabHost.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */