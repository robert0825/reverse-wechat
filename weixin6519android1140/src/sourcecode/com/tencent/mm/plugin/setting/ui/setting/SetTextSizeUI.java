package com.tencent.mm.plugin.setting.ui.setting;

import android.content.Context;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.MenuItem.OnMenuItemClickListener;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.R.i;
import com.tencent.mm.R.l;
import com.tencent.mm.br.a;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.base.preference.MMPreference;
import com.tencent.mm.ui.base.preference.Preference;
import com.tencent.mm.ui.base.preference.PreferenceCategory;
import com.tencent.mm.ui.base.preference.f;
import com.tencent.mm.ui.p;
import com.tencent.mm.ui.p.b;

public class SetTextSizeUI
  extends MMPreference
{
  private f htU;
  private float oHo;
  private int oHp;
  
  public SetTextSizeUI()
  {
    GMTrace.i(4599775756288L, 34271);
    this.oHp = 1;
    GMTrace.o(4599775756288L, 34271);
  }
  
  public static float ai(float paramFloat)
  {
    GMTrace.i(4600581062656L, 34277);
    if (paramFloat == 0.875F)
    {
      GMTrace.o(4600581062656L, 34277);
      return 14.0F;
    }
    if (paramFloat == 1.0F)
    {
      GMTrace.o(4600581062656L, 34277);
      return 16.0F;
    }
    if (paramFloat == 1.125F)
    {
      GMTrace.o(4600581062656L, 34277);
      return 18.0F;
    }
    if (paramFloat == 1.25F)
    {
      GMTrace.o(4600581062656L, 34277);
      return 20.0F;
    }
    if (paramFloat == 1.375F)
    {
      GMTrace.o(4600581062656L, 34277);
      return 22.0F;
    }
    if (paramFloat == 1.625F)
    {
      GMTrace.o(4600581062656L, 34277);
      return 26.0F;
    }
    if (paramFloat == 1.875F)
    {
      GMTrace.o(4600581062656L, 34277);
      return 28.0F;
    }
    if (paramFloat == 2.025F)
    {
      GMTrace.o(4600581062656L, 34277);
      return 30.0F;
    }
    GMTrace.o(4600581062656L, 34277);
    return 16.0F;
  }
  
  public static float dd(Context paramContext)
  {
    float f1 = 1.0F;
    GMTrace.i(4600312627200L, 34275);
    float f2 = a.dZ(paramContext);
    if ((f2 != 1.0F) && (f2 != 0.875F) && (f2 != 1.125F) && (f2 != 1.25F) && (f2 != 1.375F) && (f2 != 1.625F) && (f2 != 1.875F) && (f2 != 2.025F)) {}
    for (;;)
    {
      GMTrace.o(4600312627200L, 34275);
      return f1;
      f1 = f2;
    }
  }
  
  public static int de(Context paramContext)
  {
    GMTrace.i(4600446844928L, 34276);
    float f = dd(paramContext);
    if (f == 0.875F)
    {
      i = R.l.dXT;
      GMTrace.o(4600446844928L, 34276);
      return i;
    }
    if (f == 1.125F)
    {
      i = R.l.dXR;
      GMTrace.o(4600446844928L, 34276);
      return i;
    }
    if (f == 1.25F)
    {
      i = R.l.dXU;
      GMTrace.o(4600446844928L, 34276);
      return i;
    }
    if (f == 1.375F)
    {
      i = R.l.dXQ;
      GMTrace.o(4600446844928L, 34276);
      return i;
    }
    int i = R.l.dXS;
    GMTrace.o(4600446844928L, 34276);
    return i;
  }
  
  private void refresh()
  {
    GMTrace.i(4600983715840L, 34280);
    this.htU.removeAll();
    Object localObject = new a(this, 0.875F);
    ((Preference)localObject).setKey("setting_text_size_small");
    ((Preference)localObject).setLayoutResource(R.i.cBA);
    if (this.oHo == 0.875F)
    {
      ((Preference)localObject).setWidgetLayoutResource(R.i.cCf);
      this.htU.a((Preference)localObject);
      localObject = new a(this, 1.0F);
      ((Preference)localObject).setKey("setting_text_size_normal");
      ((Preference)localObject).setLayoutResource(R.i.cBA);
      if (this.oHo != 1.0F) {
        break label383;
      }
      ((Preference)localObject).setWidgetLayoutResource(R.i.cCf);
      label109:
      this.htU.a((Preference)localObject);
      localObject = new a(this, 1.125F);
      ((Preference)localObject).setKey("setting_text_size_large");
      ((Preference)localObject).setLayoutResource(R.i.cBA);
      if (this.oHo != 1.125F) {
        break label393;
      }
      ((Preference)localObject).setWidgetLayoutResource(R.i.cCf);
      label161:
      this.htU.a((Preference)localObject);
      localObject = new a(this, 1.25F);
      ((Preference)localObject).setKey("setting_text_size_super");
      ((Preference)localObject).setLayoutResource(R.i.cBA);
      if (this.oHo != 1.25F) {
        break label403;
      }
      ((Preference)localObject).setWidgetLayoutResource(R.i.cCf);
      label213:
      this.htU.a((Preference)localObject);
      localObject = new a(this, 1.375F);
      ((Preference)localObject).setKey("setting_text_size_huge");
      ((Preference)localObject).setLayoutResource(R.i.cBA);
      if (this.oHo != 1.375F) {
        break label413;
      }
      ((Preference)localObject).setWidgetLayoutResource(R.i.cCf);
    }
    for (;;)
    {
      this.htU.a((Preference)localObject);
      localObject = new PreferenceCategory(this);
      this.htU.a((Preference)localObject);
      this.htU.notifyDataSetChanged();
      localObject = (ViewGroup)this.vKB.vKI;
      int i = 0;
      int j = ((ViewGroup)localObject).getChildCount();
      while (i < j)
      {
        View localView = ((ViewGroup)localObject).getChildAt(i);
        if ((localView instanceof TextView)) {
          w.d("ui.settings.SetTextSize", "id=" + localView.getId());
        }
        i += 1;
      }
      ((Preference)localObject).setWidgetLayoutResource(R.i.cCg);
      break;
      label383:
      ((Preference)localObject).setWidgetLayoutResource(R.i.cCg);
      break label109;
      label393:
      ((Preference)localObject).setWidgetLayoutResource(R.i.cCg);
      break label161;
      label403:
      ((Preference)localObject).setWidgetLayoutResource(R.i.cCg);
      break label213;
      label413:
      ((Preference)localObject).setWidgetLayoutResource(R.i.cCg);
    }
    GMTrace.o(4600983715840L, 34280);
  }
  
  protected final void MP()
  {
    GMTrace.i(4600178409472L, 34274);
    this.oHo = dd(this);
    this.htU = this.wky;
    oM(R.l.eaL);
    a(new MenuItem.OnMenuItemClickListener()
    {
      public final boolean onMenuItemClick(MenuItem paramAnonymousMenuItem)
      {
        GMTrace.i(4686480408576L, 34917);
        SetTextSizeUI.this.aLo();
        SetTextSizeUI.this.finish();
        GMTrace.o(4686480408576L, 34917);
        return true;
      }
    });
    a(0, getString(R.l.dZb), new MenuItem.OnMenuItemClickListener()
    {
      public final boolean onMenuItemClick(MenuItem paramAnonymousMenuItem)
      {
        GMTrace.i(4618163585024L, 34408);
        a.e(SetTextSizeUI.this, SetTextSizeUI.a(SetTextSizeUI.this));
        SetTextSizeUI.this.finish();
        GMTrace.o(4618163585024L, 34408);
        return true;
      }
    }, p.b.vLG);
    refresh();
    GMTrace.o(4600178409472L, 34274);
  }
  
  public final int QI()
  {
    GMTrace.i(4599909974016L, 34272);
    GMTrace.o(4599909974016L, 34272);
    return -1;
  }
  
  public final boolean a(f paramf, Preference paramPreference)
  {
    GMTrace.i(4600849498112L, 34279);
    paramf = paramPreference.hiu;
    this.oHp = 1;
    if (paramf.equals("setting_text_size_small"))
    {
      this.oHo = 0.875F;
      this.oHp = 0;
    }
    for (;;)
    {
      refresh();
      GMTrace.o(4600849498112L, 34279);
      return false;
      if (paramf.equals("setting_text_size_normal"))
      {
        this.oHo = 1.0F;
        this.oHp = 1;
      }
      else if (paramf.equals("setting_text_size_large"))
      {
        this.oHo = 1.125F;
        this.oHp = 2;
      }
      else if (paramf.equals("setting_text_size_super"))
      {
        this.oHo = 1.25F;
        this.oHp = 3;
      }
      else if (paramf.equals("setting_text_size_huge"))
      {
        this.oHo = 1.375F;
        this.oHp = 4;
      }
      else if (paramf.equals("setting_text_size_huger"))
      {
        this.oHo = 1.625F;
        this.oHp = 5;
      }
      else if (paramf.equals("setting_text_size_hugers"))
      {
        this.oHo = 1.625F;
        this.oHp = 6;
      }
      else if (paramf.equals("setting_text_size_hugerss"))
      {
        this.oHo = 1.625F;
        this.oHp = 7;
      }
    }
  }
  
  public void onCreate(Bundle paramBundle)
  {
    GMTrace.i(4600044191744L, 34273);
    super.onCreate(paramBundle);
    MP();
    GMTrace.o(4600044191744L, 34273);
  }
  
  private final class a
    extends Preference
  {
    private float oHo;
    
    public a(Context paramContext, float paramFloat)
    {
      super();
      GMTrace.i(4652389105664L, 34663);
      this.oHo = paramFloat;
      GMTrace.o(4652389105664L, 34663);
    }
    
    protected final void onBindView(View paramView)
    {
      GMTrace.i(4652523323392L, 34664);
      super.onBindView(paramView);
      paramView = (TextView)paramView.findViewById(16908310);
      if (paramView != null) {
        paramView.setTextSize(1, SetTextSizeUI.ai(this.oHo));
      }
      GMTrace.o(4652523323392L, 34664);
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\setting\ui\setting\SetTextSizeUI.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */