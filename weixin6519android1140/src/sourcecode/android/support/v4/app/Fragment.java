package android.support.v4.app;

import android.app.Activity;
import android.content.ComponentCallbacks;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import android.support.v4.e.c;
import android.support.v4.e.j;
import android.support.v4.view.h;
import android.util.SparseArray;
import android.view.ContextMenu;
import android.view.ContextMenu.ContextMenuInfo;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnCreateContextMenuListener;
import android.view.ViewGroup;
import android.view.animation.Animation;
import java.io.FileDescriptor;
import java.io.PrintWriter;

public class Fragment
  implements ComponentCallbacks, View.OnCreateContextMenuListener
{
  private static final j<String, Class<?>> oe = new j();
  static final Object of = new Object();
  boolean mDetached;
  int mIndex = -1;
  int mState = 0;
  String mTag;
  public View mView;
  public Fragment oA;
  int oB;
  int oC;
  public boolean oD;
  boolean oE;
  boolean oF;
  boolean oG;
  boolean oH = true;
  boolean oI;
  int oJ;
  ViewGroup oK;
  View oL;
  boolean oM;
  boolean oN = true;
  t oO;
  boolean oP;
  boolean oQ;
  Object oR = null;
  Object oS = of;
  Object oT = null;
  Object oU = of;
  Object oV = null;
  Object oW = of;
  Boolean oX;
  Boolean oY;
  ak oZ = null;
  View og;
  int oh;
  Bundle oi;
  SparseArray<Parcelable> oj;
  String ok;
  public Bundle ol;
  Fragment om;
  int oo = -1;
  int oq;
  boolean or;
  public boolean os;
  boolean ot;
  boolean ou;
  boolean ov;
  int ow;
  m ox;
  k oy;
  m oz;
  ak pa = null;
  
  public static Fragment a(Context paramContext, String paramString, Bundle paramBundle)
  {
    try
    {
      Class localClass2 = (Class)oe.get(paramString);
      Class localClass1 = localClass2;
      if (localClass2 == null)
      {
        localClass1 = paramContext.getClassLoader().loadClass(paramString);
        oe.put(paramString, localClass1);
      }
      paramContext = (Fragment)localClass1.newInstance();
      if (paramBundle != null)
      {
        paramBundle.setClassLoader(paramContext.getClass().getClassLoader());
        paramContext.ol = paramBundle;
      }
      return paramContext;
    }
    catch (ClassNotFoundException paramContext)
    {
      throw new a("Unable to instantiate fragment " + paramString + ": make sure class name exists, is public, and has an empty constructor that is public", paramContext);
    }
    catch (InstantiationException paramContext)
    {
      throw new a("Unable to instantiate fragment " + paramString + ": make sure class name exists, is public, and has an empty constructor that is public", paramContext);
    }
    catch (IllegalAccessException paramContext)
    {
      throw new a("Unable to instantiate fragment " + paramString + ": make sure class name exists, is public, and has an empty constructor that is public", paramContext);
    }
  }
  
  public static void aJ() {}
  
  public static Animation aL()
  {
    return null;
  }
  
  public static Fragment b(Context paramContext, String paramString)
  {
    return a(paramContext, paramString, null);
  }
  
  static boolean c(Context paramContext, String paramString)
  {
    try
    {
      Class localClass2 = (Class)oe.get(paramString);
      Class localClass1 = localClass2;
      if (localClass2 == null)
      {
        localClass1 = paramContext.getClassLoader().loadClass(paramString);
        oe.put(paramString, localClass1);
      }
      boolean bool = Fragment.class.isAssignableFrom(localClass1);
      return bool;
    }
    catch (ClassNotFoundException paramContext) {}
    return false;
  }
  
  public static void onDestroyOptionsMenu() {}
  
  final View a(LayoutInflater paramLayoutInflater, ViewGroup paramViewGroup, Bundle paramBundle)
  {
    if (this.oz != null) {
      this.oz.pL = false;
    }
    return onCreateView(paramLayoutInflater, paramViewGroup, paramBundle);
  }
  
  public final FragmentActivity aG()
  {
    if (this.oy == null) {
      return null;
    }
    return (FragmentActivity)this.oy.mActivity;
  }
  
  public final void aH()
  {
    if (this.oG != true)
    {
      this.oG = true;
      if ((isAdded()) && (!this.oD)) {
        this.oy.aT();
      }
    }
  }
  
  public final s aI()
  {
    if (this.oO != null) {
      return this.oO;
    }
    if (this.oy == null) {
      throw new IllegalStateException("Fragment " + this + " not attached to Activity");
    }
    this.oQ = true;
    this.oO = this.oy.a(this.ok, this.oP, true);
    return this.oO;
  }
  
  public final void aK()
  {
    this.oI = true;
    if (this.oy == null) {}
    for (Activity localActivity = null;; localActivity = this.oy.mActivity)
    {
      if (localActivity != null)
      {
        this.oI = false;
        this.oI = true;
      }
      return;
    }
  }
  
  public void aM() {}
  
  final void aN()
  {
    this.oz = new m();
    this.oz.a(this.oy, new i()
    {
      public final View onFindViewById(int paramAnonymousInt)
      {
        if (Fragment.this.mView == null) {
          throw new IllegalStateException("Fragment does not have a view");
        }
        return Fragment.this.mView.findViewById(paramAnonymousInt);
      }
      
      public final boolean onHasView()
      {
        return Fragment.this.mView != null;
      }
    }, this);
  }
  
  final void aO()
  {
    if (this.oz != null) {
      this.oz.G(2);
    }
    this.mState = 2;
    if (this.oP)
    {
      this.oP = false;
      if (!this.oQ)
      {
        this.oQ = true;
        this.oO = this.oy.a(this.ok, this.oP, false);
      }
      if (this.oO != null)
      {
        if (!this.oy.pt) {
          break label89;
        }
        this.oO.bf();
      }
    }
    return;
    label89:
    this.oO.be();
  }
  
  public LayoutInflater c(Bundle paramBundle)
  {
    paramBundle = this.oy.onGetLayoutInflater();
    if (this.oz == null)
    {
      aN();
      if (this.mState < 5) {
        break label44;
      }
      this.oz.dispatchResume();
    }
    for (;;)
    {
      h.a(paramBundle, this.oz);
      return paramBundle;
      label44:
      if (this.mState >= 4) {
        this.oz.dispatchStart();
      } else if (this.mState >= 2) {
        this.oz.dispatchActivityCreated();
      } else if (this.mState > 0) {
        this.oz.dispatchCreate();
      }
    }
  }
  
  final void c(int paramInt, Fragment paramFragment)
  {
    this.mIndex = paramInt;
    if (paramFragment != null)
    {
      this.ok = (paramFragment.ok + ":" + this.mIndex);
      return;
    }
    this.ok = ("android:fragment:" + this.mIndex);
  }
  
  final void d(Bundle paramBundle)
  {
    onSaveInstanceState(paramBundle);
    if (this.oz != null)
    {
      Parcelable localParcelable = this.oz.saveAllState();
      if (localParcelable != null) {
        paramBundle.putParcelable("android:support:fragments", localParcelable);
      }
    }
  }
  
  public void dump(String paramString, FileDescriptor paramFileDescriptor, PrintWriter paramPrintWriter, String[] paramArrayOfString)
  {
    paramPrintWriter.print(paramString);
    paramPrintWriter.print("mFragmentId=#");
    paramPrintWriter.print(Integer.toHexString(this.oB));
    paramPrintWriter.print(" mContainerId=#");
    paramPrintWriter.print(Integer.toHexString(this.oC));
    paramPrintWriter.print(" mTag=");
    paramPrintWriter.println(this.mTag);
    paramPrintWriter.print(paramString);
    paramPrintWriter.print("mState=");
    paramPrintWriter.print(this.mState);
    paramPrintWriter.print(" mIndex=");
    paramPrintWriter.print(this.mIndex);
    paramPrintWriter.print(" mWho=");
    paramPrintWriter.print(this.ok);
    paramPrintWriter.print(" mBackStackNesting=");
    paramPrintWriter.println(this.ow);
    paramPrintWriter.print(paramString);
    paramPrintWriter.print("mAdded=");
    paramPrintWriter.print(this.or);
    paramPrintWriter.print(" mRemoving=");
    paramPrintWriter.print(this.os);
    paramPrintWriter.print(" mFromLayout=");
    paramPrintWriter.print(this.ot);
    paramPrintWriter.print(" mInLayout=");
    paramPrintWriter.println(this.ou);
    paramPrintWriter.print(paramString);
    paramPrintWriter.print("mHidden=");
    paramPrintWriter.print(this.oD);
    paramPrintWriter.print(" mDetached=");
    paramPrintWriter.print(this.mDetached);
    paramPrintWriter.print(" mMenuVisible=");
    paramPrintWriter.print(this.oH);
    paramPrintWriter.print(" mHasMenu=");
    paramPrintWriter.println(this.oG);
    paramPrintWriter.print(paramString);
    paramPrintWriter.print("mRetainInstance=");
    paramPrintWriter.print(this.oE);
    paramPrintWriter.print(" mRetaining=");
    paramPrintWriter.print(this.oF);
    paramPrintWriter.print(" mUserVisibleHint=");
    paramPrintWriter.println(this.oN);
    if (this.ox != null)
    {
      paramPrintWriter.print(paramString);
      paramPrintWriter.print("mFragmentManager=");
      paramPrintWriter.println(this.ox);
    }
    if (this.oy != null)
    {
      paramPrintWriter.print(paramString);
      paramPrintWriter.print("mHost=");
      paramPrintWriter.println(this.oy);
    }
    if (this.oA != null)
    {
      paramPrintWriter.print(paramString);
      paramPrintWriter.print("mParentFragment=");
      paramPrintWriter.println(this.oA);
    }
    if (this.ol != null)
    {
      paramPrintWriter.print(paramString);
      paramPrintWriter.print("mArguments=");
      paramPrintWriter.println(this.ol);
    }
    if (this.oi != null)
    {
      paramPrintWriter.print(paramString);
      paramPrintWriter.print("mSavedFragmentState=");
      paramPrintWriter.println(this.oi);
    }
    if (this.oj != null)
    {
      paramPrintWriter.print(paramString);
      paramPrintWriter.print("mSavedViewState=");
      paramPrintWriter.println(this.oj);
    }
    if (this.om != null)
    {
      paramPrintWriter.print(paramString);
      paramPrintWriter.print("mTarget=");
      paramPrintWriter.print(this.om);
      paramPrintWriter.print(" mTargetRequestCode=");
      paramPrintWriter.println(this.oq);
    }
    if (this.oJ != 0)
    {
      paramPrintWriter.print(paramString);
      paramPrintWriter.print("mNextAnim=");
      paramPrintWriter.println(this.oJ);
    }
    if (this.oK != null)
    {
      paramPrintWriter.print(paramString);
      paramPrintWriter.print("mContainer=");
      paramPrintWriter.println(this.oK);
    }
    if (this.mView != null)
    {
      paramPrintWriter.print(paramString);
      paramPrintWriter.print("mView=");
      paramPrintWriter.println(this.mView);
    }
    if (this.oL != null)
    {
      paramPrintWriter.print(paramString);
      paramPrintWriter.print("mInnerView=");
      paramPrintWriter.println(this.mView);
    }
    if (this.og != null)
    {
      paramPrintWriter.print(paramString);
      paramPrintWriter.print("mAnimatingAway=");
      paramPrintWriter.println(this.og);
      paramPrintWriter.print(paramString);
      paramPrintWriter.print("mStateAfterAnimating=");
      paramPrintWriter.println(this.oh);
    }
    if (this.oO != null)
    {
      paramPrintWriter.print(paramString);
      paramPrintWriter.println("Loader Manager:");
      this.oO.dump(paramString + "  ", paramFileDescriptor, paramPrintWriter, paramArrayOfString);
    }
    if (this.oz != null)
    {
      paramPrintWriter.print(paramString);
      paramPrintWriter.println("Child " + this.oz + ":");
      this.oz.dump(paramString + "  ", paramFileDescriptor, paramPrintWriter, paramArrayOfString);
    }
  }
  
  public final boolean equals(Object paramObject)
  {
    return super.equals(paramObject);
  }
  
  public Context getContext()
  {
    if (this.oy == null) {
      return null;
    }
    return this.oy.mContext;
  }
  
  public final Resources getResources()
  {
    if (this.oy == null) {
      throw new IllegalStateException("Fragment " + this + " not attached to Activity");
    }
    return this.oy.mContext.getResources();
  }
  
  public final String getString(int paramInt)
  {
    return getResources().getString(paramInt);
  }
  
  public final String getString(int paramInt, Object... paramVarArgs)
  {
    return getResources().getString(paramInt, paramVarArgs);
  }
  
  public boolean getUserVisibleHint()
  {
    return this.oN;
  }
  
  public final int hashCode()
  {
    return super.hashCode();
  }
  
  public final boolean isAdded()
  {
    return (this.oy != null) && (this.or);
  }
  
  public void onActivityCreated(Bundle paramBundle)
  {
    this.oI = true;
  }
  
  public void onActivityResult(int paramInt1, int paramInt2, Intent paramIntent) {}
  
  @Deprecated
  public void onAttach(Activity paramActivity)
  {
    this.oI = true;
  }
  
  public void onAttach(Context paramContext)
  {
    this.oI = true;
    if (this.oy == null) {}
    for (paramContext = null;; paramContext = this.oy.mActivity)
    {
      if (paramContext != null)
      {
        this.oI = false;
        onAttach(paramContext);
      }
      return;
    }
  }
  
  public void onConfigurationChanged(Configuration paramConfiguration)
  {
    this.oI = true;
  }
  
  public boolean onContextItemSelected(MenuItem paramMenuItem)
  {
    return false;
  }
  
  public void onCreate(Bundle paramBundle)
  {
    this.oI = true;
  }
  
  public void onCreateContextMenu(ContextMenu paramContextMenu, View paramView, ContextMenu.ContextMenuInfo paramContextMenuInfo)
  {
    aG().onCreateContextMenu(paramContextMenu, paramView, paramContextMenuInfo);
  }
  
  public void onCreateOptionsMenu(Menu paramMenu, MenuInflater paramMenuInflater) {}
  
  public View onCreateView(LayoutInflater paramLayoutInflater, ViewGroup paramViewGroup, Bundle paramBundle)
  {
    return null;
  }
  
  public void onDestroy()
  {
    this.oI = true;
    if (!this.oQ)
    {
      this.oQ = true;
      this.oO = this.oy.a(this.ok, this.oP, false);
    }
    if (this.oO != null) {
      this.oO.bi();
    }
  }
  
  public void onDestroyView()
  {
    this.oI = true;
  }
  
  public void onDetach()
  {
    this.oI = true;
  }
  
  public void onHiddenChanged(boolean paramBoolean) {}
  
  public void onLowMemory()
  {
    this.oI = true;
  }
  
  public boolean onOptionsItemSelected(MenuItem paramMenuItem)
  {
    return false;
  }
  
  public void onPause()
  {
    this.oI = true;
  }
  
  public void onPrepareOptionsMenu(Menu paramMenu) {}
  
  public void onResume()
  {
    this.oI = true;
  }
  
  public void onSaveInstanceState(Bundle paramBundle) {}
  
  public void onStart()
  {
    this.oI = true;
    if (!this.oP)
    {
      this.oP = true;
      if (!this.oQ)
      {
        this.oQ = true;
        this.oO = this.oy.a(this.ok, this.oP, false);
      }
      if (this.oO != null) {
        this.oO.bd();
      }
    }
  }
  
  public void onStop()
  {
    this.oI = true;
  }
  
  public void setArguments(Bundle paramBundle)
  {
    if (this.mIndex >= 0) {
      throw new IllegalStateException("Fragment already active");
    }
    this.ol = paramBundle;
  }
  
  public final void setMenuVisibility(boolean paramBoolean)
  {
    if (this.oH != paramBoolean)
    {
      this.oH = paramBoolean;
      if ((this.oG) && (isAdded()) && (!this.oD)) {
        this.oy.aT();
      }
    }
  }
  
  public void setUserVisibleHint(boolean paramBoolean)
  {
    if ((!this.oN) && (paramBoolean) && (this.mState < 4)) {
      this.ox.f(this);
    }
    this.oN = paramBoolean;
    if (!paramBoolean) {}
    for (paramBoolean = true;; paramBoolean = false)
    {
      this.oM = paramBoolean;
      return;
    }
  }
  
  public void startActivity(Intent paramIntent)
  {
    if (this.oy == null) {
      throw new IllegalStateException("Fragment " + this + " not attached to Activity");
    }
    this.oy.b(this, paramIntent, -1, null);
  }
  
  public final void startActivityForResult(Intent paramIntent, int paramInt)
  {
    if (this.oy == null) {
      throw new IllegalStateException("Fragment " + this + " not attached to Activity");
    }
    this.oy.b(this, paramIntent, paramInt, null);
  }
  
  public String toString()
  {
    StringBuilder localStringBuilder = new StringBuilder(128);
    c.a(this, localStringBuilder);
    if (this.mIndex >= 0)
    {
      localStringBuilder.append(" #");
      localStringBuilder.append(this.mIndex);
    }
    if (this.oB != 0)
    {
      localStringBuilder.append(" id=0x");
      localStringBuilder.append(Integer.toHexString(this.oB));
    }
    if (this.mTag != null)
    {
      localStringBuilder.append(" ");
      localStringBuilder.append(this.mTag);
    }
    localStringBuilder.append('}');
    return localStringBuilder.toString();
  }
  
  public static class SavedState
    implements Parcelable
  {
    public static final Parcelable.Creator<SavedState> CREATOR = new Parcelable.Creator() {};
    final Bundle pc;
    
    SavedState(Bundle paramBundle)
    {
      this.pc = paramBundle;
    }
    
    SavedState(Parcel paramParcel)
    {
      this.pc = paramParcel.readBundle();
    }
    
    public int describeContents()
    {
      return 0;
    }
    
    public void writeToParcel(Parcel paramParcel, int paramInt)
    {
      paramParcel.writeBundle(this.pc);
    }
  }
  
  public static final class a
    extends RuntimeException
  {
    public a(String paramString, Exception paramException)
    {
      super(paramException);
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\android\support\v4\app\Fragment.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */