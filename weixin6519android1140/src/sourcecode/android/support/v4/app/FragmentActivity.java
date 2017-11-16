package android.support.v4.app;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.Resources.NotFoundException;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager.LayoutParams;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

public class FragmentActivity
  extends g
  implements a.a, b.a
{
  final Handler mHandler = new Handler()
  {
    public final void handleMessage(Message paramAnonymousMessage)
    {
      switch (paramAnonymousMessage.what)
      {
      default: 
        super.handleMessage(paramAnonymousMessage);
      case 1: 
        do
        {
          return;
        } while (!FragmentActivity.this.pg);
        FragmentActivity.this.n(false);
        return;
      }
      FragmentActivity.this.aP();
      FragmentActivity.this.pd.execPendingActions();
    }
  };
  boolean oF;
  final j pd = new j(new a());
  boolean pe;
  boolean pf;
  boolean pg;
  boolean ph;
  boolean pi;
  boolean pj;
  int pk;
  boolean pl;
  android.support.v4.e.k<String> pm;
  
  private void a(String paramString, PrintWriter paramPrintWriter, View paramView)
  {
    paramPrintWriter.print(paramString);
    if (paramView == null) {
      paramPrintWriter.println("null");
    }
    for (;;)
    {
      return;
      paramPrintWriter.println(x(paramView));
      if ((paramView instanceof ViewGroup))
      {
        paramView = (ViewGroup)paramView;
        int j = paramView.getChildCount();
        if (j > 0)
        {
          paramString = paramString + "  ";
          int i = 0;
          while (i < j)
          {
            a(paramString, paramPrintWriter, paramView.getChildAt(i));
            i += 1;
          }
        }
      }
    }
  }
  
  private int d(Fragment paramFragment)
  {
    if (this.pm.size() >= 65534) {
      throw new IllegalStateException("Too many pending Fragment activity results.");
    }
    while (this.pm.indexOfKey(this.pk) >= 0) {
      this.pk = ((this.pk + 1) % 65534);
    }
    int i = this.pk;
    this.pm.put(i, paramFragment.ok);
    this.pk = ((this.pk + 1) % 65534);
    return i;
  }
  
  private static String x(View paramView)
  {
    char c3 = 'F';
    char c2 = '.';
    StringBuilder localStringBuilder = new StringBuilder(128);
    localStringBuilder.append(paramView.getClass().getName());
    localStringBuilder.append('{');
    localStringBuilder.append(Integer.toHexString(System.identityHashCode(paramView)));
    localStringBuilder.append(' ');
    char c1;
    label118:
    label135:
    label152:
    label169:
    label186:
    label203:
    label220:
    label244:
    label261:
    int i;
    Object localObject;
    switch (paramView.getVisibility())
    {
    default: 
      localStringBuilder.append('.');
      if (paramView.isFocusable())
      {
        c1 = 'F';
        localStringBuilder.append(c1);
        if (!paramView.isEnabled()) {
          break label562;
        }
        c1 = 'E';
        localStringBuilder.append(c1);
        if (!paramView.willNotDraw()) {
          break label568;
        }
        c1 = '.';
        localStringBuilder.append(c1);
        if (!paramView.isHorizontalScrollBarEnabled()) {
          break label574;
        }
        c1 = 'H';
        localStringBuilder.append(c1);
        if (!paramView.isVerticalScrollBarEnabled()) {
          break label580;
        }
        c1 = 'V';
        localStringBuilder.append(c1);
        if (!paramView.isClickable()) {
          break label586;
        }
        c1 = 'C';
        localStringBuilder.append(c1);
        if (!paramView.isLongClickable()) {
          break label592;
        }
        c1 = 'L';
        localStringBuilder.append(c1);
        localStringBuilder.append(' ');
        if (!paramView.isFocused()) {
          break label598;
        }
        c1 = c3;
        localStringBuilder.append(c1);
        if (!paramView.isSelected()) {
          break label604;
        }
        c1 = 'S';
        localStringBuilder.append(c1);
        c1 = c2;
        if (paramView.isPressed()) {
          c1 = 'P';
        }
        localStringBuilder.append(c1);
        localStringBuilder.append(' ');
        localStringBuilder.append(paramView.getLeft());
        localStringBuilder.append(',');
        localStringBuilder.append(paramView.getTop());
        localStringBuilder.append('-');
        localStringBuilder.append(paramView.getRight());
        localStringBuilder.append(',');
        localStringBuilder.append(paramView.getBottom());
        i = paramView.getId();
        if (i != -1)
        {
          localStringBuilder.append(" #");
          localStringBuilder.append(Integer.toHexString(i));
          localObject = paramView.getResources();
          if ((i != 0) && (localObject != null)) {
            switch (0xFF000000 & i)
            {
            }
          }
        }
      }
      break;
    }
    for (;;)
    {
      try
      {
        paramView = ((Resources)localObject).getResourcePackageName(i);
        String str = ((Resources)localObject).getResourceTypeName(i);
        localObject = ((Resources)localObject).getResourceEntryName(i);
        localStringBuilder.append(" ");
        localStringBuilder.append(paramView);
        localStringBuilder.append(":");
        localStringBuilder.append(str);
        localStringBuilder.append("/");
        localStringBuilder.append((String)localObject);
      }
      catch (Resources.NotFoundException paramView)
      {
        label562:
        label568:
        label574:
        label580:
        label586:
        label592:
        label598:
        label604:
        continue;
      }
      localStringBuilder.append("}");
      return localStringBuilder.toString();
      localStringBuilder.append('V');
      break;
      localStringBuilder.append('I');
      break;
      localStringBuilder.append('G');
      break;
      c1 = '.';
      break label118;
      c1 = '.';
      break label135;
      c1 = 'D';
      break label152;
      c1 = '.';
      break label169;
      c1 = '.';
      break label186;
      c1 = '.';
      break label203;
      c1 = '.';
      break label220;
      c1 = '.';
      break label244;
      c1 = '.';
      break label261;
      paramView = "app";
      continue;
      paramView = "android";
    }
  }
  
  public final void C(int paramInt)
  {
    if ((!this.pj) && (paramInt != -1) && ((0xFFFF0000 & paramInt) != 0)) {
      throw new IllegalArgumentException("Can only use lower 16 bits for requestCode");
    }
  }
  
  final View a(View paramView, String paramString, Context paramContext, AttributeSet paramAttributeSet)
  {
    return this.pd.oy.ox.onCreateView(paramView, paramString, paramContext, paramAttributeSet);
  }
  
  public void a(Fragment paramFragment, Intent paramIntent, int paramInt)
  {
    a(paramFragment, paramIntent, paramInt, null);
  }
  
  public final void a(Fragment paramFragment, Intent paramIntent, int paramInt, Bundle paramBundle)
  {
    this.pl = true;
    if (paramInt == -1) {}
    try
    {
      a.a(this, paramIntent, -1, paramBundle);
      return;
    }
    finally
    {
      this.pl = false;
    }
    if ((0xFFFF0000 & paramInt) != 0) {
      throw new IllegalArgumentException("Can only use lower 16 bits for requestCode");
    }
    a.a(this, paramIntent, (d(paramFragment) + 1 << 16) + (0xFFFF & paramInt), paramBundle);
    this.pl = false;
  }
  
  protected final void aP()
  {
    this.pd.oy.ox.dispatchResume();
  }
  
  public void aQ()
  {
    if (Build.VERSION.SDK_INT >= 11)
    {
      invalidateOptionsMenu();
      return;
    }
    this.pi = true;
  }
  
  public final l aR()
  {
    return this.pd.oy.ox;
  }
  
  public void dump(String paramString, FileDescriptor paramFileDescriptor, PrintWriter paramPrintWriter, String[] paramArrayOfString)
  {
    int i = Build.VERSION.SDK_INT;
    paramPrintWriter.print(paramString);
    paramPrintWriter.print("Local FragmentActivity ");
    paramPrintWriter.print(Integer.toHexString(System.identityHashCode(this)));
    paramPrintWriter.println(" State:");
    String str = paramString + "  ";
    paramPrintWriter.print(str);
    paramPrintWriter.print("mCreated=");
    paramPrintWriter.print(this.pe);
    paramPrintWriter.print("mResumed=");
    paramPrintWriter.print(this.pf);
    paramPrintWriter.print(" mStopped=");
    paramPrintWriter.print(this.pg);
    paramPrintWriter.print(" mReallyStopped=");
    paramPrintWriter.println(this.ph);
    k localk = this.pd.oy;
    paramPrintWriter.print(str);
    paramPrintWriter.print("mLoadersStarted=");
    paramPrintWriter.println(localk.oP);
    if (localk.oO != null)
    {
      paramPrintWriter.print(str);
      paramPrintWriter.print("Loader Manager ");
      paramPrintWriter.print(Integer.toHexString(System.identityHashCode(localk.oO)));
      paramPrintWriter.println(":");
      localk.oO.dump(str + "  ", paramFileDescriptor, paramPrintWriter, paramArrayOfString);
    }
    this.pd.oy.ox.dump(paramString, paramFileDescriptor, paramPrintWriter, paramArrayOfString);
    paramPrintWriter.print(paramString);
    paramPrintWriter.println("View Hierarchy:");
    a(paramString + "  ", paramPrintWriter, getWindow().getDecorView());
  }
  
  final void n(boolean paramBoolean)
  {
    Object localObject;
    if (!this.ph)
    {
      this.ph = true;
      this.oF = paramBoolean;
      this.mHandler.removeMessages(1);
      localObject = this.pd;
      paramBoolean = this.oF;
      localObject = ((j)localObject).oy;
      ((k)localObject).pt = paramBoolean;
      if ((((k)localObject).oO != null) && (((k)localObject).oP))
      {
        ((k)localObject).oP = false;
        if (!paramBoolean) {
          break label90;
        }
        ((k)localObject).oO.bf();
      }
    }
    for (;;)
    {
      this.pd.oy.ox.G(2);
      return;
      label90:
      ((k)localObject).oO.be();
    }
  }
  
  public void onActivityResult(int paramInt1, int paramInt2, Intent paramIntent)
  {
    this.pd.noteStateNotSaved();
    int i = paramInt1 >> 16;
    if (i != 0)
    {
      i -= 1;
      Object localObject = (String)this.pm.get(i);
      this.pm.remove(i);
      if (localObject == null) {}
      do
      {
        return;
        localObject = this.pd.j((String)localObject);
      } while (localObject == null);
      ((Fragment)localObject).onActivityResult(0xFFFF & paramInt1, paramInt2, paramIntent);
      return;
    }
    super.onActivityResult(paramInt1, paramInt2, paramIntent);
  }
  
  public void onBackPressed()
  {
    if (!this.pd.oy.ox.popBackStackImmediate()) {
      aE();
    }
  }
  
  public void onConfigurationChanged(Configuration paramConfiguration)
  {
    super.onConfigurationChanged(paramConfiguration);
    this.pd.oy.ox.dispatchConfigurationChanged(paramConfiguration);
  }
  
  public void onCreate(Bundle paramBundle)
  {
    Object localObject1 = this.pd;
    ((j)localObject1).oy.ox.a(((j)localObject1).oy, ((j)localObject1).oy, null);
    super.onCreate(paramBundle);
    localObject1 = (b)getLastNonConfigurationInstance();
    Object localObject2;
    Object localObject3;
    if (localObject1 != null)
    {
      localObject2 = this.pd;
      localObject3 = ((b)localObject1).pq;
      ((j)localObject2).oy.ps = ((android.support.v4.e.j)localObject3);
    }
    if (paramBundle != null)
    {
      localObject2 = paramBundle.getParcelable("android:support:fragments");
      localObject3 = this.pd;
      if (localObject1 == null) {
        break label194;
      }
      localObject1 = ((b)localObject1).pp;
      ((j)localObject3).oy.ox.restoreAllState((Parcelable)localObject2, (List)localObject1);
      if (paramBundle.containsKey("android:support:next_request_index"))
      {
        this.pk = paramBundle.getInt("android:support:next_request_index");
        localObject1 = paramBundle.getIntArray("android:support:request_indicies");
        paramBundle = paramBundle.getStringArray("android:support:request_fragment_who");
        if ((localObject1 != null) && (paramBundle != null) && (localObject1.length == paramBundle.length)) {
          break label199;
        }
      }
    }
    for (;;)
    {
      if (this.pm == null)
      {
        this.pm = new android.support.v4.e.k();
        this.pk = 0;
      }
      this.pd.oy.ox.dispatchCreate();
      return;
      label194:
      localObject1 = null;
      break;
      label199:
      this.pm = new android.support.v4.e.k(localObject1.length);
      int i = 0;
      while (i < localObject1.length)
      {
        this.pm.put(localObject1[i], paramBundle[i]);
        i += 1;
      }
    }
  }
  
  public boolean onCreatePanelMenu(int paramInt, Menu paramMenu)
  {
    if (paramInt == 0)
    {
      boolean bool1 = super.onCreatePanelMenu(paramInt, paramMenu);
      j localj = this.pd;
      MenuInflater localMenuInflater = getMenuInflater();
      boolean bool2 = localj.oy.ox.dispatchCreateOptionsMenu(paramMenu, localMenuInflater);
      if (Build.VERSION.SDK_INT >= 11) {
        return bool1 | bool2;
      }
      return true;
    }
    return super.onCreatePanelMenu(paramInt, paramMenu);
  }
  
  public void onDestroy()
  {
    super.onDestroy();
    n(false);
    this.pd.oy.ox.dispatchDestroy();
    k localk = this.pd.oy;
    if (localk.oO != null) {
      localk.oO.bi();
    }
  }
  
  public boolean onKeyDown(int paramInt, KeyEvent paramKeyEvent)
  {
    if ((Build.VERSION.SDK_INT < 5) && (paramInt == 4) && (paramKeyEvent.getRepeatCount() == 0))
    {
      onBackPressed();
      return true;
    }
    return super.onKeyDown(paramInt, paramKeyEvent);
  }
  
  public void onLowMemory()
  {
    super.onLowMemory();
    this.pd.oy.ox.dispatchLowMemory();
  }
  
  public boolean onMenuItemSelected(int paramInt, MenuItem paramMenuItem)
  {
    if (super.onMenuItemSelected(paramInt, paramMenuItem)) {
      return true;
    }
    switch (paramInt)
    {
    default: 
      return false;
    case 0: 
      return this.pd.oy.ox.dispatchOptionsItemSelected(paramMenuItem);
    }
    return this.pd.oy.ox.dispatchContextItemSelected(paramMenuItem);
  }
  
  public void onNewIntent(Intent paramIntent)
  {
    super.onNewIntent(paramIntent);
    this.pd.noteStateNotSaved();
  }
  
  public void onPanelClosed(int paramInt, Menu paramMenu)
  {
    switch (paramInt)
    {
    }
    for (;;)
    {
      super.onPanelClosed(paramInt, paramMenu);
      return;
      this.pd.oy.ox.dispatchOptionsMenuClosed(paramMenu);
    }
  }
  
  public void onPause()
  {
    super.onPause();
    this.pf = false;
    if (this.mHandler.hasMessages(2))
    {
      this.mHandler.removeMessages(2);
      aP();
    }
    this.pd.oy.ox.G(4);
  }
  
  public void onPostResume()
  {
    super.onPostResume();
    this.mHandler.removeMessages(2);
    aP();
    this.pd.execPendingActions();
  }
  
  public boolean onPreparePanel(int paramInt, View paramView, Menu paramMenu)
  {
    if ((paramInt == 0) && (paramMenu != null))
    {
      if (this.pi)
      {
        this.pi = false;
        paramMenu.clear();
        onCreatePanelMenu(paramInt, paramMenu);
      }
      return super.onPreparePanel(0, paramView, paramMenu) | this.pd.oy.ox.dispatchPrepareOptionsMenu(paramMenu);
    }
    return super.onPreparePanel(paramInt, paramView, paramMenu);
  }
  
  public void onRequestPermissionsResult(int paramInt, String[] paramArrayOfString, int[] paramArrayOfInt)
  {
    paramInt = paramInt >> 16 & 0xFFFF;
    if (paramInt != 0)
    {
      paramInt -= 1;
      paramArrayOfString = (String)this.pm.get(paramInt);
      this.pm.remove(paramInt);
      if (paramArrayOfString != null) {
        break label42;
      }
    }
    label42:
    while (this.pd.j(paramArrayOfString) == null) {
      return;
    }
    Fragment.aJ();
  }
  
  public void onResume()
  {
    super.onResume();
    this.mHandler.sendEmptyMessage(2);
    this.pf = true;
    this.pd.execPendingActions();
  }
  
  public final Object onRetainNonConfigurationInstance()
  {
    if (this.pg) {
      n(true);
    }
    m localm = this.pd.oy.ox;
    Object localObject2;
    if (localm.py != null)
    {
      int i = 0;
      localObject1 = null;
      localObject2 = localObject1;
      if (i < localm.py.size())
      {
        Fragment localFragment = (Fragment)localm.py.get(i);
        localObject3 = localObject1;
        if (localFragment != null)
        {
          localObject3 = localObject1;
          if (localFragment.oE)
          {
            localObject2 = localObject1;
            if (localObject1 == null) {
              localObject2 = new ArrayList();
            }
            ((ArrayList)localObject2).add(localFragment);
            localFragment.oF = true;
            if (localFragment.om == null) {
              break label177;
            }
          }
        }
        label177:
        for (int j = localFragment.om.mIndex;; j = -1)
        {
          localFragment.oo = j;
          localObject3 = localObject2;
          if (m.DEBUG)
          {
            new StringBuilder("retainNonConfig: keeping retained ").append(localFragment);
            localObject3 = localObject2;
          }
          i += 1;
          localObject1 = localObject3;
          break;
        }
      }
    }
    else
    {
      localObject2 = null;
    }
    Object localObject1 = this.pd.oy.aU();
    if ((localObject2 == null) && (localObject1 == null)) {
      return null;
    }
    Object localObject3 = new b();
    ((b)localObject3).po = null;
    ((b)localObject3).pp = ((List)localObject2);
    ((b)localObject3).pq = ((android.support.v4.e.j)localObject1);
    return localObject3;
  }
  
  public void onSaveInstanceState(Bundle paramBundle)
  {
    super.onSaveInstanceState(paramBundle);
    Object localObject = this.pd.oy.ox.saveAllState();
    if (localObject != null) {
      paramBundle.putParcelable("android:support:fragments", (Parcelable)localObject);
    }
    if (this.pm.size() > 0)
    {
      paramBundle.putInt("android:support:next_request_index", this.pk);
      localObject = new int[this.pm.size()];
      String[] arrayOfString = new String[this.pm.size()];
      int i = 0;
      while (i < this.pm.size())
      {
        localObject[i] = this.pm.keyAt(i);
        arrayOfString[i] = ((String)this.pm.valueAt(i));
        i += 1;
      }
      paramBundle.putIntArray("android:support:request_indicies", (int[])localObject);
      paramBundle.putStringArray("android:support:request_fragment_who", arrayOfString);
    }
  }
  
  public void onStart()
  {
    super.onStart();
    this.pg = false;
    this.ph = false;
    this.mHandler.removeMessages(1);
    if (!this.pe)
    {
      this.pe = true;
      this.pd.oy.ox.dispatchActivityCreated();
    }
    this.pd.noteStateNotSaved();
    this.pd.execPendingActions();
    Object localObject = this.pd.oy;
    if (!((k)localObject).oP)
    {
      ((k)localObject).oP = true;
      if (((k)localObject).oO == null) {
        break label183;
      }
      ((k)localObject).oO.bd();
    }
    k localk;
    int k;
    for (;;)
    {
      ((k)localObject).oQ = true;
      this.pd.oy.ox.dispatchStart();
      localk = this.pd.oy;
      if (localk.ps == null) {
        return;
      }
      k = localk.ps.size();
      localObject = new t[k];
      i = k - 1;
      while (i >= 0)
      {
        localObject[i] = ((t)localk.ps.valueAt(i));
        i -= 1;
      }
      label183:
      if (!((k)localObject).oQ)
      {
        ((k)localObject).oO = ((k)localObject).a("(root)", ((k)localObject).oP, false);
        if ((((k)localObject).oO != null) && (!((k)localObject).oO.mP)) {
          ((k)localObject).oO.bd();
        }
      }
    }
    int i = 0;
    while (i < k)
    {
      localk = localObject[i];
      if (localk.oF)
      {
        if (t.DEBUG) {
          new StringBuilder("Finished Retaining in ").append(localk);
        }
        localk.oF = false;
        int j = localk.qJ.size() - 1;
        while (j >= 0)
        {
          t.a locala = (t.a)localk.qJ.valueAt(j);
          if (locala.oF)
          {
            if (t.DEBUG) {
              new StringBuilder("  Finished Retaining: ").append(locala);
            }
            locala.oF = false;
            if ((locala.mP != locala.qR) && (!locala.mP)) {
              locala.stop();
            }
          }
          if ((locala.mP) && (locala.qP) && (!locala.qS)) {
            locala.c(locala.qO, locala.mData);
          }
          j -= 1;
        }
      }
      localk.bh();
      i += 1;
    }
  }
  
  public void onStateNotSaved()
  {
    this.pd.noteStateNotSaved();
  }
  
  public void onStop()
  {
    super.onStop();
    this.pg = true;
    this.mHandler.sendEmptyMessage(1);
    this.pd.oy.ox.dispatchStop();
  }
  
  public void startActivityForResult(Intent paramIntent, int paramInt)
  {
    if ((!this.pl) && (paramInt != -1) && ((0xFFFF0000 & paramInt) != 0)) {
      throw new IllegalArgumentException("Can only use lower 16 bits for requestCode");
    }
    super.startActivityForResult(paramIntent, paramInt);
  }
  
  final class a
    extends k<FragmentActivity>
  {
    public a()
    {
      super();
    }
    
    public final void a(String paramString, PrintWriter paramPrintWriter, String[] paramArrayOfString)
    {
      FragmentActivity.this.dump(paramString, null, paramPrintWriter, paramArrayOfString);
    }
    
    public final boolean aS()
    {
      return !FragmentActivity.this.isFinishing();
    }
    
    public final void aT()
    {
      FragmentActivity.this.aQ();
    }
    
    public final void b(Fragment paramFragment, Intent paramIntent, int paramInt, Bundle paramBundle)
    {
      FragmentActivity.this.a(paramFragment, paramIntent, paramInt, null);
    }
    
    public final View onFindViewById(int paramInt)
    {
      return FragmentActivity.this.findViewById(paramInt);
    }
    
    public final LayoutInflater onGetLayoutInflater()
    {
      return FragmentActivity.this.getLayoutInflater().cloneInContext(FragmentActivity.this);
    }
    
    public final int onGetWindowAnimations()
    {
      Window localWindow = FragmentActivity.this.getWindow();
      if (localWindow == null) {
        return 0;
      }
      return localWindow.getAttributes().windowAnimations;
    }
    
    public final boolean onHasView()
    {
      Window localWindow = FragmentActivity.this.getWindow();
      return (localWindow != null) && (localWindow.peekDecorView() != null);
    }
    
    public final boolean onHasWindowAnimations()
    {
      return FragmentActivity.this.getWindow() != null;
    }
  }
  
  static final class b
  {
    Object po;
    List<Fragment> pp;
    android.support.v4.e.j<String, s> pq;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\android\support\v4\app\FragmentActivity.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */