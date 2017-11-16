package android.support.v7.view;

import android.content.Context;
import android.content.res.TypedArray;
import android.support.v4.c.a.b;
import android.support.v4.view.d;
import android.support.v4.view.m;
import android.support.v7.a.a.k;
import android.support.v7.view.menu.h;
import android.support.v7.view.menu.i;
import android.util.AttributeSet;
import android.view.InflateException;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.MenuItem.OnMenuItemClickListener;
import android.view.SubMenu;
import android.view.View;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import org.xmlpull.v1.XmlPullParser;

public final class g
  extends MenuInflater
{
  private static final Class<?>[] IB;
  private static final Class<?>[] IC;
  private final Object[] IE;
  private final Object[] IF;
  private Object IG;
  private Context mContext;
  
  static
  {
    Class[] arrayOfClass = new Class[1];
    arrayOfClass[0] = Context.class;
    IB = arrayOfClass;
    IC = arrayOfClass;
  }
  
  public g(Context paramContext)
  {
    super(paramContext);
    this.mContext = paramContext;
    this.IE = new Object[] { paramContext };
    this.IF = this.IE;
  }
  
  private void a(XmlPullParser paramXmlPullParser, AttributeSet paramAttributeSet, Menu paramMenu)
  {
    b localb = new b(paramMenu);
    int i = paramXmlPullParser.getEventType();
    int j = 0;
    paramMenu = null;
    Object localObject;
    int k;
    if (i == 2)
    {
      localObject = paramXmlPullParser.getName();
      if (((String)localObject).equals("menu"))
      {
        k = paramXmlPullParser.next();
        label56:
        i = 0;
        label59:
        if (i != 0) {
          return;
        }
      }
    }
    switch (k)
    {
    default: 
    case 2: 
    case 3: 
      for (;;)
      {
        k = paramXmlPullParser.next();
        break label59;
        throw new RuntimeException("Expecting menu, got " + (String)localObject);
        k = paramXmlPullParser.next();
        i = k;
        if (k != 1) {
          break;
        }
        break label56;
        if (j == 0)
        {
          localObject = paramXmlPullParser.getName();
          if (((String)localObject).equals("group"))
          {
            localObject = localb.Jh.mContext.obtainStyledAttributes(paramAttributeSet, a.k.MenuGroup);
            localb.IJ = ((TypedArray)localObject).getResourceId(a.k.MenuGroup_android_id, 0);
            localb.IK = ((TypedArray)localObject).getInt(a.k.MenuGroup_android_menuCategory, 0);
            localb.IL = ((TypedArray)localObject).getInt(a.k.MenuGroup_android_orderInCategory, 0);
            localb.IM = ((TypedArray)localObject).getInt(a.k.MenuGroup_android_checkableBehavior, 0);
            localb.IN = ((TypedArray)localObject).getBoolean(a.k.MenuGroup_android_visible, true);
            localb.IO = ((TypedArray)localObject).getBoolean(a.k.MenuGroup_android_enabled, true);
            ((TypedArray)localObject).recycle();
          }
          else
          {
            if (((String)localObject).equals("item"))
            {
              localObject = localb.Jh.mContext.obtainStyledAttributes(paramAttributeSet, a.k.MenuItem);
              localb.IQ = ((TypedArray)localObject).getResourceId(a.k.MenuItem_android_id, 0);
              localb.IR = (((TypedArray)localObject).getInt(a.k.MenuItem_android_menuCategory, localb.IK) & 0xFFFF0000 | ((TypedArray)localObject).getInt(a.k.MenuItem_android_orderInCategory, localb.IL) & 0xFFFF);
              localb.IS = ((TypedArray)localObject).getText(a.k.MenuItem_android_title);
              localb.IT = ((TypedArray)localObject).getText(a.k.MenuItem_android_titleCondensed);
              localb.IU = ((TypedArray)localObject).getResourceId(a.k.MenuItem_android_icon, 0);
              localb.IV = b.q(((TypedArray)localObject).getString(a.k.MenuItem_android_alphabeticShortcut));
              localb.IW = b.q(((TypedArray)localObject).getString(a.k.MenuItem_android_numericShortcut));
              if (((TypedArray)localObject).hasValue(a.k.MenuItem_android_checkable)) {
                if (((TypedArray)localObject).getBoolean(a.k.MenuItem_android_checkable, false))
                {
                  k = 1;
                  label458:
                  localb.IX = k;
                  label465:
                  localb.IY = ((TypedArray)localObject).getBoolean(a.k.MenuItem_android_checked, false);
                  localb.IZ = ((TypedArray)localObject).getBoolean(a.k.MenuItem_android_visible, localb.IN);
                  localb.Ja = ((TypedArray)localObject).getBoolean(a.k.MenuItem_android_enabled, localb.IO);
                  localb.Jb = ((TypedArray)localObject).getInt(a.k.MenuItem_showAsAction, -1);
                  localb.Jf = ((TypedArray)localObject).getString(a.k.MenuItem_android_onClick);
                  localb.Jc = ((TypedArray)localObject).getResourceId(a.k.MenuItem_actionLayout, 0);
                  localb.Jd = ((TypedArray)localObject).getString(a.k.MenuItem_actionViewClass);
                  localb.Je = ((TypedArray)localObject).getString(a.k.MenuItem_actionProviderClass);
                  if (localb.Je == null) {
                    break label676;
                  }
                  k = 1;
                  label593:
                  if ((k == 0) || (localb.Jc != 0) || (localb.Jd != null)) {
                    break label682;
                  }
                }
              }
              label676:
              label682:
              for (localb.Jg = ((d)localb.newInstance(localb.Je, IC, localb.Jh.IF));; localb.Jg = null)
              {
                ((TypedArray)localObject).recycle();
                localb.IP = false;
                break;
                k = 0;
                break label458;
                localb.IX = localb.IM;
                break label465;
                k = 0;
                break label593;
              }
            }
            if (((String)localObject).equals("menu"))
            {
              a(paramXmlPullParser, paramAttributeSet, localb.di());
            }
            else
            {
              j = 1;
              paramMenu = (Menu)localObject;
              continue;
              localObject = paramXmlPullParser.getName();
              if ((j != 0) && (((String)localObject).equals(paramMenu)))
              {
                j = 0;
                paramMenu = null;
              }
              else if (((String)localObject).equals("group"))
              {
                localb.dh();
              }
              else if (((String)localObject).equals("item"))
              {
                if (!localb.IP) {
                  if ((localb.Jg != null) && (localb.Jg.hasSubMenu()))
                  {
                    localb.di();
                  }
                  else
                  {
                    localb.IP = true;
                    localb.e(localb.II.add(localb.IJ, localb.IQ, localb.IR, localb.IS));
                  }
                }
              }
              else if (((String)localObject).equals("menu"))
              {
                i = 1;
              }
            }
          }
        }
      }
    }
    throw new RuntimeException("Unexpected end of document");
  }
  
  /* Error */
  public final void inflate(int paramInt, Menu paramMenu)
  {
    // Byte code:
    //   0: aload_2
    //   1: instanceof 347
    //   4: ifne +10 -> 14
    //   7: aload_0
    //   8: iload_1
    //   9: aload_2
    //   10: invokespecial 349	android/view/MenuInflater:inflate	(ILandroid/view/Menu;)V
    //   13: return
    //   14: aconst_null
    //   15: astore_3
    //   16: aconst_null
    //   17: astore 5
    //   19: aconst_null
    //   20: astore 4
    //   22: aload_0
    //   23: getfield 38	android/support/v7/view/g:mContext	Landroid/content/Context;
    //   26: invokevirtual 353	android/content/Context:getResources	()Landroid/content/res/Resources;
    //   29: iload_1
    //   30: invokevirtual 359	android/content/res/Resources:getLayout	(I)Landroid/content/res/XmlResourceParser;
    //   33: astore 6
    //   35: aload 6
    //   37: astore 4
    //   39: aload 6
    //   41: astore_3
    //   42: aload 6
    //   44: astore 5
    //   46: aload_0
    //   47: aload 6
    //   49: aload 6
    //   51: invokestatic 365	android/util/Xml:asAttributeSet	(Lorg/xmlpull/v1/XmlPullParser;)Landroid/util/AttributeSet;
    //   54: aload_2
    //   55: invokespecial 301	android/support/v7/view/g:a	(Lorg/xmlpull/v1/XmlPullParser;Landroid/util/AttributeSet;Landroid/view/Menu;)V
    //   58: aload 6
    //   60: ifnull -47 -> 13
    //   63: aload 6
    //   65: invokeinterface 370 1 0
    //   70: return
    //   71: astore_2
    //   72: aload 4
    //   74: astore_3
    //   75: new 372	android/view/InflateException
    //   78: dup
    //   79: ldc_w 374
    //   82: aload_2
    //   83: invokespecial 377	android/view/InflateException:<init>	(Ljava/lang/String;Ljava/lang/Throwable;)V
    //   86: athrow
    //   87: astore_2
    //   88: aload_3
    //   89: ifnull +9 -> 98
    //   92: aload_3
    //   93: invokeinterface 370 1 0
    //   98: aload_2
    //   99: athrow
    //   100: astore_2
    //   101: aload 5
    //   103: astore_3
    //   104: new 372	android/view/InflateException
    //   107: dup
    //   108: ldc_w 374
    //   111: aload_2
    //   112: invokespecial 377	android/view/InflateException:<init>	(Ljava/lang/String;Ljava/lang/Throwable;)V
    //   115: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	116	0	this	g
    //   0	116	1	paramInt	int
    //   0	116	2	paramMenu	Menu
    //   15	89	3	localObject1	Object
    //   20	53	4	localObject2	Object
    //   17	85	5	localObject3	Object
    //   33	31	6	localXmlResourceParser	android.content.res.XmlResourceParser
    // Exception table:
    //   from	to	target	type
    //   22	35	71	org/xmlpull/v1/XmlPullParserException
    //   46	58	71	org/xmlpull/v1/XmlPullParserException
    //   22	35	87	finally
    //   46	58	87	finally
    //   75	87	87	finally
    //   104	116	87	finally
    //   22	35	100	java/io/IOException
    //   46	58	100	java/io/IOException
  }
  
  private static final class a
    implements MenuItem.OnMenuItemClickListener
  {
    private static final Class<?>[] IH = { MenuItem.class };
    private Object IG;
    private Method mMethod;
    
    public a(Object paramObject, String paramString)
    {
      this.IG = paramObject;
      Class localClass = paramObject.getClass();
      try
      {
        this.mMethod = localClass.getMethod(paramString, IH);
        return;
      }
      catch (Exception paramObject)
      {
        paramString = new InflateException("Couldn't resolve menu item onClick handler " + paramString + " in class " + localClass.getName());
        paramString.initCause((Throwable)paramObject);
        throw paramString;
      }
    }
    
    public final boolean onMenuItemClick(MenuItem paramMenuItem)
    {
      try
      {
        if (this.mMethod.getReturnType() == Boolean.TYPE) {
          return ((Boolean)this.mMethod.invoke(this.IG, new Object[] { paramMenuItem })).booleanValue();
        }
        this.mMethod.invoke(this.IG, new Object[] { paramMenuItem });
        return true;
      }
      catch (Exception paramMenuItem)
      {
        throw new RuntimeException(paramMenuItem);
      }
    }
  }
  
  private final class b
  {
    Menu II;
    int IJ;
    int IK;
    int IL;
    int IM;
    boolean IN;
    boolean IO;
    boolean IP;
    int IQ;
    int IR;
    CharSequence IS;
    CharSequence IT;
    int IU;
    char IV;
    char IW;
    int IX;
    boolean IY;
    boolean IZ;
    boolean Ja;
    int Jb;
    int Jc;
    String Jd;
    String Je;
    String Jf;
    public d Jg;
    
    public b(Menu paramMenu)
    {
      this.II = paramMenu;
      dh();
    }
    
    static char q(String paramString)
    {
      if (paramString == null) {
        return '\000';
      }
      return paramString.charAt(0);
    }
    
    public final void dh()
    {
      this.IJ = 0;
      this.IK = 0;
      this.IL = 0;
      this.IM = 0;
      this.IN = true;
      this.IO = true;
    }
    
    public final SubMenu di()
    {
      this.IP = true;
      SubMenu localSubMenu = this.II.addSubMenu(this.IJ, this.IQ, this.IR, this.IS);
      e(localSubMenu.getItem());
      return localSubMenu;
    }
    
    final void e(MenuItem paramMenuItem)
    {
      int i = 1;
      Object localObject = paramMenuItem.setChecked(this.IY).setVisible(this.IZ).setEnabled(this.Ja);
      if (this.IX > 0) {}
      for (boolean bool = true;; bool = false)
      {
        ((MenuItem)localObject).setCheckable(bool).setTitleCondensed(this.IT).setIcon(this.IU).setAlphabeticShortcut(this.IV).setNumericShortcut(this.IW);
        if (this.Jb >= 0) {
          m.a(paramMenuItem, this.Jb);
        }
        if (this.Jf == null) {
          break label161;
        }
        if (!g.a(g.this).isRestricted()) {
          break;
        }
        throw new IllegalStateException("The android:onClick attribute cannot be used within a restricted context");
      }
      paramMenuItem.setOnMenuItemClickListener(new g.a(g.b(g.this), this.Jf));
      label161:
      if (this.IX >= 2)
      {
        if ((paramMenuItem instanceof h)) {
          ((h)paramMenuItem).E(true);
        }
      }
      else
      {
        if (this.Jd == null) {
          break label339;
        }
        m.a(paramMenuItem, (View)newInstance(this.Jd, g.dg(), g.c(g.this)));
      }
      for (;;)
      {
        if ((this.Jc > 0) && (i == 0)) {
          m.b(paramMenuItem, this.Jc);
        }
        if (this.Jg != null) {
          m.a(paramMenuItem, this.Jg);
        }
        return;
        if (!(paramMenuItem instanceof i)) {
          break;
        }
        localObject = (i)paramMenuItem;
        try
        {
          if (((i)localObject).KR == null) {
            ((i)localObject).KR = ((b)((i)localObject).JP).getClass().getDeclaredMethod("setExclusiveCheckable", new Class[] { Boolean.TYPE });
          }
          ((i)localObject).KR.invoke(((i)localObject).JP, new Object[] { Boolean.valueOf(true) });
        }
        catch (Exception localException) {}
        break;
        label339:
        i = 0;
      }
    }
    
    final <T> T newInstance(String paramString, Class<?>[] paramArrayOfClass, Object[] paramArrayOfObject)
    {
      try
      {
        paramString = g.a(g.this).getClassLoader().loadClass(paramString).getConstructor(paramArrayOfClass);
        paramString.setAccessible(true);
        paramString = paramString.newInstance(paramArrayOfObject);
        return paramString;
      }
      catch (Exception paramString) {}
      return null;
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\android\support\v7\view\g.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */