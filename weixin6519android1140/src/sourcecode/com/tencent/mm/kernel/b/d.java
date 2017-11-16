package com.tencent.mm.kernel.b;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.kernel.f;
import com.tencent.mm.kernel.i;
import com.tencent.mm.kernel.j;
import java.util.HashSet;
import junit.framework.Assert;

public abstract class d
  implements c
{
  private static final String TAG = "MMKernel.Plugin";
  private boolean mConfigured;
  private boolean mDependencyMade;
  private boolean mInstalled;
  private boolean mMakingDependencies;
  private boolean mPendingInstall;
  private HashSet<b> mPins;
  
  public d()
  {
    GMTrace.i(13522436096000L, 100750);
    this.mInstalled = false;
    this.mConfigured = false;
    this.mDependencyMade = false;
    this.mMakingDependencies = false;
    this.mPendingInstall = false;
    this.mPins = new HashSet();
    GMTrace.o(13522436096000L, 100750);
  }
  
  private void checkIfNeedDefaultDependency()
  {
    GMTrace.i(18796119064576L, 140042);
    i.xD();
    Object localObject = i.xu();
    Class localClass = getClass();
    if (!((com.tencent.mm.kernel.c)localObject).fYF.au(localClass))
    {
      i.xD();
      localObject = i.xu().fYI;
      if (localObject != null)
      {
        dependsOn((Class)localObject);
        j.i("MMKernel.Plugin", "plugin[%s] not specific any depsOn, we using default one [%s]", new Object[] { this, localObject });
      }
    }
    GMTrace.o(18796119064576L, 140042);
  }
  
  private final void detectAlias()
  {
    GMTrace.i(18795716411392L, 140039);
    Class[] arrayOfClass = getClass().getInterfaces();
    int j = arrayOfClass.length;
    int i = 0;
    while (i < j)
    {
      Class localClass = arrayOfClass[i];
      if (a.class.isAssignableFrom(localClass)) {
        alias(localClass);
      }
      i += 1;
    }
    GMTrace.o(18795716411392L, 140039);
  }
  
  public void alias(Class<? extends a> paramClass)
  {
    GMTrace.i(13523107184640L, 100755);
    Assert.assertNotNull(paramClass);
    Assert.assertTrue(paramClass.isInstance(this));
    i.xD();
    i.xu().c(getClass(), paramClass);
    GMTrace.o(13523107184640L, 100755);
  }
  
  public void dependency()
  {
    GMTrace.i(18795984846848L, 140041);
    GMTrace.o(18795984846848L, 140041);
  }
  
  public void dependsOn(Class<? extends a> paramClass)
  {
    GMTrace.i(13523375620096L, 100757);
    if (!this.mMakingDependencies)
    {
      j.w("MMKernel.Plugin", "Ignore this dependency. It's not dependency phase now!", new Object[0]);
      GMTrace.o(13523375620096L, 100757);
      return;
    }
    i.xD();
    i.xu().d(getClass(), paramClass);
    GMTrace.o(13523375620096L, 100757);
  }
  
  public void dependsOnRoot()
  {
    GMTrace.i(13523241402368L, 100756);
    if (!this.mMakingDependencies)
    {
      j.w("MMKernel.Plugin", "Ignore this dependency. It's not dependency phase now!", new Object[0]);
      GMTrace.o(13523241402368L, 100756);
      return;
    }
    i.xD();
    i.xu().d(getClass(), getClass());
    GMTrace.o(13523241402368L, 100756);
  }
  
  public int hashCode()
  {
    GMTrace.i(13524315144192L, 100764);
    int i = name().hashCode();
    GMTrace.o(13524315144192L, 100764);
    return i;
  }
  
  public String identify()
  {
    GMTrace.i(13523509837824L, 100758);
    String str = getClass().getSimpleName();
    GMTrace.o(13523509837824L, 100758);
    return str;
  }
  
  public void installed()
  {
    GMTrace.i(18795850629120L, 140040);
    GMTrace.o(18795850629120L, 140040);
  }
  
  public void invokeConfigure(e parame)
  {
    GMTrace.i(13522972966912L, 100754);
    configure(parame);
    this.mConfigured = true;
    GMTrace.o(13522972966912L, 100754);
  }
  
  public void invokeDependency()
  {
    GMTrace.i(13522838749184L, 100753);
    this.mMakingDependencies = true;
    dependency();
    checkIfNeedDefaultDependency();
    this.mDependencyMade = true;
    this.mMakingDependencies = false;
    GMTrace.o(13522838749184L, 100753);
  }
  
  public void invokeInstalled()
  {
    GMTrace.i(14610941870080L, 108860);
    this.mInstalled = true;
    installed();
    detectAlias();
    GMTrace.o(14610941870080L, 108860);
  }
  
  public boolean isConfigured()
  {
    GMTrace.i(13523644055552L, 100759);
    boolean bool = this.mConfigured;
    GMTrace.o(13523644055552L, 100759);
    return bool;
  }
  
  public boolean isDependencyMade()
  {
    GMTrace.i(14611344523264L, 108863);
    boolean bool = this.mDependencyMade;
    GMTrace.o(14611344523264L, 108863);
    return bool;
  }
  
  public String name()
  {
    GMTrace.i(13523912491008L, 100761);
    String str = toString();
    GMTrace.o(13523912491008L, 100761);
    return str;
  }
  
  public String[] ofProcesses()
  {
    GMTrace.i(13524180926464L, 100763);
    GMTrace.o(13524180926464L, 100763);
    return new String[0];
  }
  
  public void pin(b paramb)
  {
    try
    {
      GMTrace.i(14611076087808L, 108861);
      if (!this.mPins.contains(paramb))
      {
        this.mPins.add(paramb);
        i.xD();
        i.xu().a(paramb.getClass(), new com.tencent.mm.kernel.c.d(paramb));
      }
      GMTrace.o(14611076087808L, 108861);
      return;
    }
    finally {}
  }
  
  public String toString()
  {
    GMTrace.i(13524046708736L, 100762);
    String str = getClass().getName() + '@' + Integer.toHexString(super.hashCode());
    GMTrace.o(13524046708736L, 100762);
    return str;
  }
  
  public void uninstalled()
  {
    GMTrace.i(13522704531456L, 100752);
    this.mConfigured = false;
    this.mInstalled = false;
    GMTrace.o(13522704531456L, 100752);
  }
  
  public void unpin(b paramb)
  {
    try
    {
      GMTrace.i(14611210305536L, 108862);
      if (this.mPins.contains(paramb))
      {
        this.mPins.remove(paramb);
        i.xD();
        i.xu().i(paramb.getClass());
      }
      GMTrace.o(14611210305536L, 108862);
      return;
    }
    finally {}
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\kernel\b\d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */