package com.tencent.mm.ui;

import android.content.Context;
import android.content.res.TypedArray;
import android.os.Build.VERSION;
import android.util.AttributeSet;
import android.view.InflateException;
import android.view.LayoutInflater;
import android.view.LayoutInflater.Factory;
import android.view.View;
import android.view.ViewStub;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.br.a;
import com.tencent.mm.bs.e;
import com.tencent.mm.sdk.platformtools.w;

public final class v
{
  public static final int[] vMI;
  public static final int[] vMJ;
  
  static
  {
    GMTrace.i(1872739958784L, 13953);
    vMI = new int[] { 16843087, 16843088, 16843379 };
    vMJ = new int[] { 16843379 };
    GMTrace.o(1872739958784L, 13953);
  }
  
  public static LayoutInflater b(LayoutInflater paramLayoutInflater)
  {
    GMTrace.i(1872471523328L, 13951);
    a.dZ(paramLayoutInflater.getContext());
    paramLayoutInflater = paramLayoutInflater.cloneInContext(paramLayoutInflater.getContext());
    a locala = new a();
    locala.layoutInflater = paramLayoutInflater;
    paramLayoutInflater.setFactory(locala);
    GMTrace.o(1872471523328L, 13951);
    return paramLayoutInflater;
  }
  
  public static LayoutInflater fb(Context paramContext)
  {
    GMTrace.i(1872605741056L, 13952);
    a.dZ(paramContext);
    paramContext = LayoutInflater.from(paramContext).cloneInContext(paramContext);
    a locala = new a();
    locala.layoutInflater = paramContext;
    paramContext.setFactory(locala);
    GMTrace.o(1872605741056L, 13952);
    return paramContext;
  }
  
  private static final class a
    implements LayoutInflater.Factory
  {
    LayoutInflater layoutInflater;
    
    public a()
    {
      GMTrace.i(2900042448896L, 21607);
      GMTrace.o(2900042448896L, 21607);
    }
    
    private View createView(String paramString1, String paramString2, AttributeSet paramAttributeSet)
    {
      GMTrace.i(2900310884352L, 21609);
      Object localObject = null;
      try
      {
        paramString1 = this.layoutInflater.createView(paramString1, paramString2, paramAttributeSet);
        GMTrace.o(2900310884352L, 21609);
        return paramString1;
      }
      catch (ClassNotFoundException paramString1)
      {
        for (;;)
        {
          paramString1 = (String)localObject;
        }
      }
      catch (InflateException paramString1)
      {
        for (;;)
        {
          paramString1 = (String)localObject;
        }
      }
    }
    
    public final View onCreateView(String paramString, Context paramContext, AttributeSet paramAttributeSet)
    {
      Object localObject5 = null;
      Object localObject4 = null;
      GMTrace.i(2900176666624L, 21608);
      Object localObject2 = localObject4;
      Object localObject3 = localObject5;
      Object localObject1;
      label122:
      float f;
      label727:
      label870:
      int j;
      label1034:
      label1236:
      label1398:
      label1643:
      label1805:
      label1931:
      do
      {
        for (;;)
        {
          try
          {
            if (paramString.indexOf(".") == -1)
            {
              localObject2 = localObject4;
              localObject3 = localObject5;
              if (!paramString.equals("WebView")) {
                break label2382;
              }
              localObject2 = localObject4;
              localObject3 = localObject5;
              localObject1 = createView(paramString, "android.webkit.", paramAttributeSet);
              localObject2 = localObject1;
              if (localObject1 == null)
              {
                localObject2 = localObject4;
                localObject3 = localObject5;
                localObject1 = createView(paramString, "android.widget.", paramAttributeSet);
                localObject2 = localObject1;
              }
              if (localObject2 != null) {
                break label2375;
              }
              localObject2 = localObject4;
              localObject3 = localObject5;
              localObject1 = createView(paramString, "android.view.", paramAttributeSet);
              localObject2 = localObject1;
              localObject3 = localObject1;
              if ((localObject1 instanceof ViewStub))
              {
                localObject2 = localObject1;
                localObject3 = localObject1;
                if (Build.VERSION.SDK_INT >= 21)
                {
                  localObject2 = localObject1;
                  localObject3 = localObject1;
                  ((ViewStub)localObject1).setLayoutInflater(this.layoutInflater);
                }
              }
              if (localObject1 == null) {
                break label2336;
              }
              localObject2 = localObject1;
              localObject3 = localObject1;
              if (!paramString.equals("TextView"))
              {
                localObject2 = localObject1;
                localObject3 = localObject1;
                if (!paramString.equals("Button"))
                {
                  localObject2 = localObject1;
                  localObject3 = localObject1;
                  if (!paramString.equals("EditText"))
                  {
                    localObject2 = localObject1;
                    localObject3 = localObject1;
                    if (!paramString.equals("CheckBox"))
                    {
                      localObject2 = localObject1;
                      localObject3 = localObject1;
                      if (!paramString.equals("ImageView"))
                      {
                        localObject2 = localObject1;
                        localObject3 = localObject1;
                        if (!paramString.equals("CheckedTextView"))
                        {
                          localObject2 = localObject1;
                          localObject3 = localObject1;
                          if (!paramString.equals("com.tencent.mm.ui.widget.MMTextView"))
                          {
                            localObject2 = localObject1;
                            localObject3 = localObject1;
                            if (!paramString.equals("com.tencent.mm.ui.widget.MMEditText"))
                            {
                              localObject2 = localObject1;
                              localObject3 = localObject1;
                              if (!paramString.equals("com.tencent.mm.ui.base.MMClearEditText"))
                              {
                                localObject2 = localObject1;
                                localObject3 = localObject1;
                                if (!paramString.equals("com.tencent.mm.ui.base.PasterEditText"))
                                {
                                  localObject2 = localObject1;
                                  localObject3 = localObject1;
                                  if (!paramString.equals("com.tenpay.android.wechat.TenpaySecureEditText"))
                                  {
                                    localObject2 = localObject1;
                                    localObject3 = localObject1;
                                    if (!paramString.equals("com.tencent.mm.ui.base.MMVisiblePasswordEditText"))
                                    {
                                      localObject2 = localObject1;
                                      localObject3 = localObject1;
                                      if (!paramString.equals("com.tencent.mm.ui.tools.MMTruncTextView"))
                                      {
                                        localObject2 = localObject1;
                                        localObject3 = localObject1;
                                        if (!paramString.equals("com.tencent.mm.plugin.brandservice.ui.base.CatalogView"))
                                        {
                                          localObject2 = localObject1;
                                          localObject3 = localObject1;
                                          if (!paramString.equals("com.tencent.mm.ui.tools.CustomFitTextView"))
                                          {
                                            localObject2 = localObject1;
                                            localObject3 = localObject1;
                                            if (!paramString.equals("com.tencent.mm.ui.tools.ActionBarSearchView$ActionBarEditText"))
                                            {
                                              localObject2 = localObject1;
                                              localObject3 = localObject1;
                                              if (!paramString.equals("com.tencent.mm.plugin.favorite.ui.base.FavDetailFooterView"))
                                              {
                                                localObject2 = localObject1;
                                                localObject3 = localObject1;
                                                if (!paramString.equals("com.tencent.mm.plugin.game.ui.GameDropdownView"))
                                                {
                                                  localObject2 = localObject1;
                                                  localObject3 = localObject1;
                                                  if (!paramString.equals("com.tencent.mm.ui.ScrollAlwaysTextView"))
                                                  {
                                                    localObject2 = localObject1;
                                                    localObject3 = localObject1;
                                                    if (!paramString.equals("com.tencent.mm.ui.base.MMAutoSizeTextView"))
                                                    {
                                                      localObject2 = localObject1;
                                                      localObject3 = localObject1;
                                                      if (!paramString.equals("com.tencent.mm.ui.widget.MMAutoAdjustTextView"))
                                                      {
                                                        localObject2 = localObject1;
                                                        localObject3 = localObject1;
                                                        if (!paramString.equals("com.tencent.mm.plugin.sns.ui.AsyncTextView"))
                                                        {
                                                          localObject2 = localObject1;
                                                          localObject3 = localObject1;
                                                          if (!paramString.equals("com.tencent.mm.plugin.sns.ui.SnsTextView"))
                                                          {
                                                            localObject2 = localObject1;
                                                            localObject3 = localObject1;
                                                            if (!paramString.equals("com.tencent.mm.plugin.sns.ui.MaskTextView"))
                                                            {
                                                              localObject2 = localObject1;
                                                              localObject3 = localObject1;
                                                              if (!paramString.equals("com.tencent.mm.plugin.sns.ui.SnsEditText"))
                                                              {
                                                                localObject2 = localObject1;
                                                                localObject4 = localObject1;
                                                                localObject3 = localObject1;
                                                                if (!paramString.equals("com.tencent.mm.kiss.widget.textview.PLSysTextView")) {
                                                                  continue;
                                                                }
                                                              }
                                                            }
                                                          }
                                                        }
                                                      }
                                                    }
                                                  }
                                                }
                                              }
                                            }
                                          }
                                        }
                                      }
                                    }
                                  }
                                }
                              }
                            }
                          }
                        }
                      }
                    }
                  }
                }
              }
              localObject2 = localObject1;
              localObject3 = localObject1;
              f = a.dZ(paramContext);
              if ((f != 1.875F) && (f != 2.025F)) {
                break label2372;
              }
              localObject2 = localObject1;
              localObject3 = localObject1;
              if (paramString.equals("com.tencent.mm.ui.widget.MMTextView")) {
                break label2372;
              }
              localObject2 = localObject1;
              localObject3 = localObject1;
              if (paramString.equals("com.tencent.mm.plugin.sns.ui.AsyncTextView")) {
                break label2372;
              }
              localObject2 = localObject1;
              localObject3 = localObject1;
              if (paramString.equals("com.tencent.mm.plugin.sns.ui.SnsTextView")) {
                break label2372;
              }
              localObject2 = localObject1;
              localObject3 = localObject1;
              if (paramString.equals("com.tencent.mm.plugin.sns.ui.MaskTextView")) {
                break label2372;
              }
              f = 1.625F;
              localObject2 = localObject1;
              localObject3 = localObject1;
              if (!paramString.equals("TextView"))
              {
                localObject2 = localObject1;
                localObject3 = localObject1;
                if (!paramString.equals("com.tencent.mm.ui.widget.MMTextView")) {
                  continue;
                }
              }
              localObject2 = localObject1;
              localObject3 = localObject1;
              localObject5 = (TextView)localObject1;
              localObject2 = localObject1;
              localObject3 = localObject1;
              ((TextView)localObject5).setTextSize(1, f * ((TextView)localObject5).getTextSize() / a.getDensity(((TextView)localObject5).getContext()));
              localObject2 = localObject1;
              localObject3 = localObject1;
              paramContext.getAssets();
              localObject2 = localObject1;
              localObject3 = localObject1;
              e.bOD();
              localObject2 = localObject1;
              localObject4 = localObject1;
              localObject3 = localObject1;
              if (!e.bOE()) {
                continue;
              }
              localObject2 = localObject1;
              localObject3 = localObject1;
              paramAttributeSet = paramContext.obtainStyledAttributes(paramAttributeSet, v.vMI);
              i = 0;
              localObject2 = localObject1;
              localObject3 = localObject1;
              if (i >= v.vMI.length) {
                continue;
              }
              localObject2 = localObject1;
              localObject3 = localObject1;
              j = paramAttributeSet.getResourceId(i, 0);
              if (j == 0) {
                break label2388;
              }
              localObject2 = localObject1;
              localObject3 = localObject1;
              if (v.vMI[i] == 16843379)
              {
                localObject2 = localObject1;
                localObject3 = localObject1;
                ((TextView)localObject5).setContentDescription(paramContext.getString(j));
                break label2388;
              }
            }
            else
            {
              localObject2 = localObject4;
              localObject3 = localObject5;
              localObject1 = this.layoutInflater.createView(paramString, null, paramAttributeSet);
              continue;
            }
            localObject2 = localObject1;
            localObject3 = localObject1;
            if (v.vMI[i] == 16843088)
            {
              localObject2 = localObject1;
              localObject3 = localObject1;
              ((TextView)localObject5).setHint(paramContext.getString(j));
            }
          }
          catch (ClassNotFoundException paramContext)
          {
            w.w("MicroMsg.MMLayoutInflater", "[cpan] class not found. name:%s. Use default Inflate.", new Object[] { paramString });
            localObject4 = localObject2;
            GMTrace.o(2900176666624L, 21608);
            return (View)localObject4;
            localObject2 = localObject1;
            localObject3 = localObject1;
            ((TextView)localObject5).setText(paramContext.getString(j));
          }
          catch (InflateException paramContext)
          {
            w.w("MicroMsg.MMLayoutInflater", "[cpan] Inflate failed. name:%s. Use default Inflate.", new Object[] { paramString });
            localObject4 = localObject3;
            continue;
            localObject2 = localObject1;
            localObject3 = localObject1;
            paramAttributeSet.recycle();
            localObject4 = localObject1;
            continue;
            localObject2 = localObject1;
            localObject3 = localObject1;
            if (!paramString.equals("Button")) {
              break label1398;
            }
          }
          localObject2 = localObject1;
          localObject3 = localObject1;
          localObject5 = (Button)localObject1;
          localObject2 = localObject1;
          localObject3 = localObject1;
          ((Button)localObject5).setTextSize(1, f * ((Button)localObject5).getTextSize() / a.getDensity(((Button)localObject5).getContext()));
          localObject2 = localObject1;
          localObject3 = localObject1;
          paramContext.getAssets();
          localObject2 = localObject1;
          localObject3 = localObject1;
          e.bOD();
          localObject2 = localObject1;
          localObject4 = localObject1;
          localObject3 = localObject1;
          if (e.bOE())
          {
            localObject2 = localObject1;
            localObject3 = localObject1;
            paramAttributeSet = paramContext.obtainStyledAttributes(paramAttributeSet, v.vMI);
            i = 0;
            localObject2 = localObject1;
            localObject3 = localObject1;
            if (i < v.vMI.length)
            {
              localObject2 = localObject1;
              localObject3 = localObject1;
              j = paramAttributeSet.getResourceId(i, 0);
              if (j == 0) {
                break label2397;
              }
              localObject2 = localObject1;
              localObject3 = localObject1;
              if (v.vMI[i] == 16843379)
              {
                localObject2 = localObject1;
                localObject3 = localObject1;
                ((Button)localObject5).setContentDescription(paramContext.getString(j));
                break label2397;
              }
              localObject2 = localObject1;
              localObject3 = localObject1;
              if (v.vMI[i] == 16843088)
              {
                localObject2 = localObject1;
                localObject3 = localObject1;
                ((Button)localObject5).setHint(paramContext.getString(j));
                break label2397;
              }
              localObject2 = localObject1;
              localObject3 = localObject1;
              ((Button)localObject5).setText(paramContext.getString(j));
              break label2397;
            }
            localObject2 = localObject1;
            localObject3 = localObject1;
            paramAttributeSet.recycle();
            localObject4 = localObject1;
            continue;
            localObject2 = localObject1;
            localObject3 = localObject1;
            if (!paramString.equals("EditText"))
            {
              localObject2 = localObject1;
              localObject3 = localObject1;
              if (!paramString.equals("com.tencent.mm.ui.widget.MMEditText"))
              {
                localObject2 = localObject1;
                localObject3 = localObject1;
                if (!paramString.equals("com.tencent.mm.ui.base.MMClearEditText"))
                {
                  localObject2 = localObject1;
                  localObject3 = localObject1;
                  if (!paramString.equals("com.tencent.mm.ui.base.PasterEditText"))
                  {
                    localObject2 = localObject1;
                    localObject3 = localObject1;
                    if (!paramString.equals("com.tencent.mm.ui.tools.ActionBarSearchView$ActionBarEditText"))
                    {
                      localObject2 = localObject1;
                      localObject3 = localObject1;
                      if (!paramString.equals("com.tenpay.android.wechat.TenpaySecureEditText"))
                      {
                        localObject2 = localObject1;
                        localObject3 = localObject1;
                        if (!paramString.equals("com.tencent.mm.ui.base.MMVisiblePasswordEditText"))
                        {
                          localObject2 = localObject1;
                          localObject3 = localObject1;
                          if (!paramString.equals("com.tencent.mm.plugin.sns.ui.SnsEditText")) {
                            break label1805;
                          }
                        }
                      }
                    }
                  }
                }
              }
            }
            localObject2 = localObject1;
            localObject3 = localObject1;
            localObject5 = (EditText)localObject1;
            localObject2 = localObject1;
            localObject3 = localObject1;
            ((EditText)localObject5).setTextSize(1, f * ((EditText)localObject5).getTextSize() / a.getDensity(((EditText)localObject5).getContext()));
            localObject2 = localObject1;
            localObject3 = localObject1;
            paramContext.getAssets();
            localObject2 = localObject1;
            localObject3 = localObject1;
            e.bOD();
            localObject2 = localObject1;
            localObject4 = localObject1;
            localObject3 = localObject1;
            if (e.bOE())
            {
              localObject2 = localObject1;
              localObject3 = localObject1;
              paramAttributeSet = paramContext.obtainStyledAttributes(paramAttributeSet, v.vMI);
              i = 0;
              localObject2 = localObject1;
              localObject3 = localObject1;
              if (i < v.vMI.length)
              {
                localObject2 = localObject1;
                localObject3 = localObject1;
                j = paramAttributeSet.getResourceId(i, 0);
                if (j == 0) {
                  break label2406;
                }
                localObject2 = localObject1;
                localObject3 = localObject1;
                if (v.vMI[i] == 16843379)
                {
                  localObject2 = localObject1;
                  localObject3 = localObject1;
                  ((EditText)localObject5).setContentDescription(paramContext.getString(j));
                  break label2406;
                }
                localObject2 = localObject1;
                localObject3 = localObject1;
                if (v.vMI[i] == 16843088)
                {
                  localObject2 = localObject1;
                  localObject3 = localObject1;
                  ((EditText)localObject5).setHint(paramContext.getString(j));
                  break label2406;
                }
                localObject2 = localObject1;
                localObject3 = localObject1;
                ((EditText)localObject5).setText(paramContext.getString(j));
                break label2406;
              }
              localObject2 = localObject1;
              localObject3 = localObject1;
              paramAttributeSet.recycle();
              localObject4 = localObject1;
              continue;
              localObject2 = localObject1;
              localObject3 = localObject1;
              if (!paramString.equals("CheckBox")) {
                break;
              }
              localObject2 = localObject1;
              localObject3 = localObject1;
              localObject5 = (CheckBox)localObject1;
              localObject2 = localObject1;
              localObject3 = localObject1;
              ((CheckBox)localObject5).setTextSize(1, f * ((CheckBox)localObject5).getTextSize() / a.getDensity(((CheckBox)localObject5).getContext()));
              localObject2 = localObject1;
              localObject3 = localObject1;
              paramContext.getAssets();
              localObject2 = localObject1;
              localObject3 = localObject1;
              e.bOD();
              localObject2 = localObject1;
              localObject4 = localObject1;
              localObject3 = localObject1;
              if (e.bOE())
              {
                localObject2 = localObject1;
                localObject3 = localObject1;
                paramAttributeSet = paramContext.obtainStyledAttributes(paramAttributeSet, v.vMI);
                i = 0;
                localObject2 = localObject1;
                localObject3 = localObject1;
                if (i < v.vMI.length)
                {
                  localObject2 = localObject1;
                  localObject3 = localObject1;
                  j = paramAttributeSet.getResourceId(i, 0);
                  if (j == 0) {
                    break label2415;
                  }
                  localObject2 = localObject1;
                  localObject3 = localObject1;
                  if (v.vMI[i] == 16843379)
                  {
                    localObject2 = localObject1;
                    localObject3 = localObject1;
                    ((CheckBox)localObject5).setContentDescription(paramContext.getString(j));
                    break label2415;
                  }
                  localObject2 = localObject1;
                  localObject3 = localObject1;
                  if (v.vMI[i] == 16843088)
                  {
                    localObject2 = localObject1;
                    localObject3 = localObject1;
                    ((CheckBox)localObject5).setHint(paramContext.getString(j));
                    break label2415;
                  }
                  localObject2 = localObject1;
                  localObject3 = localObject1;
                  ((CheckBox)localObject5).setText(paramContext.getString(j));
                  break label2415;
                }
                localObject2 = localObject1;
                localObject3 = localObject1;
                paramAttributeSet.recycle();
                localObject4 = localObject1;
              }
            }
          }
        }
        localObject2 = localObject1;
        localObject3 = localObject1;
        if (!paramString.equals("ImageView")) {
          break;
        }
        localObject2 = localObject1;
        localObject3 = localObject1;
        localObject5 = (ImageView)localObject1;
        localObject2 = localObject1;
        localObject3 = localObject1;
        paramContext.getAssets();
        localObject2 = localObject1;
        localObject3 = localObject1;
        e.bOD();
        localObject2 = localObject1;
        localObject4 = localObject1;
        localObject3 = localObject1;
      } while (!e.bOE());
      localObject2 = localObject1;
      localObject3 = localObject1;
      paramAttributeSet = paramContext.obtainStyledAttributes(paramAttributeSet, v.vMJ);
      int i = 0;
      for (;;)
      {
        localObject2 = localObject1;
        localObject3 = localObject1;
        if (i < v.vMJ.length)
        {
          localObject2 = localObject1;
          localObject3 = localObject1;
          j = paramAttributeSet.getResourceId(i, 0);
          if (j != 0)
          {
            localObject2 = localObject1;
            localObject3 = localObject1;
            if (v.vMJ[i] == 16843379)
            {
              localObject2 = localObject1;
              localObject3 = localObject1;
              ((ImageView)localObject5).setContentDescription(paramContext.getString(j));
            }
          }
        }
        else
        {
          localObject2 = localObject1;
          localObject3 = localObject1;
          paramAttributeSet.recycle();
          localObject4 = localObject1;
          break label1034;
          localObject2 = localObject1;
          localObject3 = localObject1;
          paramContext = (TextView)localObject1;
          localObject2 = localObject1;
          localObject3 = localObject1;
          paramContext.setTextSize(1, f * paramContext.getTextSize() / a.getDensity(paramContext.getContext()));
          localObject4 = localObject1;
          break label1034;
          label2336:
          localObject2 = localObject1;
          localObject3 = localObject1;
          w.w("MicroMsg.MMLayoutInflater", "Inflate view, ClassNotFound " + paramString);
          localObject4 = localObject1;
          break label1034;
          label2372:
          break label727;
          label2375:
          localObject1 = localObject2;
          break label122;
          label2382:
          localObject1 = null;
          break;
          label2388:
          i += 1;
          break label870;
          label2397:
          i += 1;
          break label1236;
          label2406:
          i += 1;
          break label1643;
          label2415:
          i += 1;
          break label1931;
        }
        i += 1;
      }
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\ui\v.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */