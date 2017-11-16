package com.tencent.mm.plugin.recharge.ui.form;

import android.content.Context;
import android.content.res.Resources;
import android.telephony.PhoneNumberUtils;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.View.OnFocusChangeListener;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.EditText;
import android.widget.TextView;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.kernel.e;
import com.tencent.mm.kernel.h;
import com.tencent.mm.plugin.wxpay.a.c;
import com.tencent.mm.plugin.wxpay.a.i;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.storage.t;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public final class c
{
  public static String TAG;
  
  static
  {
    GMTrace.i(7861400764416L, 58572);
    TAG = "MicroMsg.CommonHintViewConfig";
    GMTrace.o(7861400764416L, 58572);
  }
  
  public static void b(MallFormView paramMallFormView)
  {
    GMTrace.i(7861132328960L, 58570);
    if (paramMallFormView == null)
    {
      w.e(TAG, "hy: param error");
      GMTrace.o(7861132328960L, 58570);
      return;
    }
    paramMallFormView.ogl = new a()
    {
      public final String Fu(String paramAnonymousString)
      {
        GMTrace.i(7873883013120L, 58665);
        if (paramAnonymousString == null)
        {
          GMTrace.o(7873883013120L, 58665);
          return "";
        }
        paramAnonymousString = paramAnonymousString.replaceAll(" ", "");
        GMTrace.o(7873883013120L, 58665);
        return paramAnonymousString;
      }
      
      public final boolean a(MallFormView paramAnonymousMallFormView)
      {
        GMTrace.i(7873614577664L, 58663);
        boolean bool = PhoneNumberUtils.isGlobalPhoneNumber(com.tencent.mm.plugin.recharge.model.b.Fp(paramAnonymousMallFormView.getText().toString()));
        GMTrace.o(7873614577664L, 58663);
        return bool;
      }
      
      public final boolean baz()
      {
        GMTrace.i(7873748795392L, 58664);
        GMTrace.o(7873748795392L, 58664);
        return true;
      }
    };
    GMTrace.o(7861132328960L, 58570);
  }
  
  private static class a
    implements b
  {
    public a()
    {
      GMTrace.i(7868514304000L, 58625);
      GMTrace.o(7868514304000L, 58625);
    }
    
    public String Fu(String paramString)
    {
      GMTrace.i(7868916957184L, 58628);
      GMTrace.o(7868916957184L, 58628);
      return null;
    }
    
    public boolean a(MallFormView paramMallFormView)
    {
      GMTrace.i(7868648521728L, 58626);
      GMTrace.o(7868648521728L, 58626);
      return true;
    }
    
    public boolean baz()
    {
      GMTrace.i(7868782739456L, 58627);
      GMTrace.o(7868782739456L, 58627);
      return false;
    }
  }
  
  public static final class b
  {
    public List<String[]> oeq;
    public com.tencent.mm.plugin.recharge.model.a oer;
    public MallFormView ofY;
    public d ofZ;
    public boolean oga;
    
    public b(MallFormView paramMallFormView)
    {
      GMTrace.i(7863011377152L, 58584);
      this.oer = null;
      this.ofY = null;
      this.oga = false;
      this.ofY = paramMallFormView;
      GMTrace.o(7863011377152L, 58584);
    }
    
    public final void b(com.tencent.mm.plugin.recharge.model.a parama)
    {
      GMTrace.i(7863279812608L, 58586);
      this.oer = parama;
      if (parama != null)
      {
        if ((bg.nm(this.ofY.getText())) || (!this.ofY.getText().equals(parama.odE))) {
          this.ofY.oge.setText(com.tencent.mm.plugin.recharge.model.b.Fq(parama.odE));
        }
        this.ofY.oge.setSelection(this.ofY.oge.getText().length());
        w.d(c.TAG, "editTv.setText %s, name: %s, location: %s, type: %s", new Object[] { parama.odE, parama.name, parama.odF, Integer.valueOf(parama.eDi) });
        Context localContext = this.ofY.getContext();
        if (this.oer.eDi == 3)
        {
          this.ofY.ogg.setText(this.oer.name);
          this.ofY.ogg.setTextColor(localContext.getResources().getColor(a.c.smG));
          GMTrace.o(7863279812608L, 58586);
          return;
        }
        if (this.oer.eDi == 1)
        {
          if (!bg.nm(this.oer.name))
          {
            str = this.oer.name;
            parama = str;
            if (!bg.nm(this.oer.odF)) {
              parama = str + localContext.getString(a.i.tfz, new Object[] { this.oer.odF });
            }
            this.ofY.ogg.setText(parama);
            this.ofY.ogg.setTextColor(localContext.getResources().getColor(a.c.aOE));
            GMTrace.o(7863279812608L, 58586);
            return;
          }
          String str = localContext.getString(a.i.tfH);
          parama = str;
          if (!bg.nm(this.oer.odF)) {
            parama = str + localContext.getString(a.i.tfz, new Object[] { this.oer.odF });
          }
          this.ofY.ogg.setText(parama);
          this.ofY.ogg.setTextColor(localContext.getResources().getColor(a.c.smC));
          GMTrace.o(7863279812608L, 58586);
          return;
        }
        if (this.oer.eDi == 2)
        {
          if (!bg.nm(this.oer.odF))
          {
            this.ofY.ogg.setText(this.oer.odF);
            this.ofY.ogg.setTextColor(localContext.getResources().getColor(a.c.aOE));
            GMTrace.o(7863279812608L, 58586);
            return;
          }
          this.ofY.ogg.setText("");
          this.ofY.ogg.setTextColor(localContext.getResources().getColor(a.c.smC));
          GMTrace.o(7863279812608L, 58586);
          return;
        }
        if (this.oer.eDi == 0)
        {
          if (!bg.nm(this.oer.odF))
          {
            if (!bg.nm(this.oer.name))
            {
              this.ofY.ogg.setText(this.oer.name + localContext.getString(a.i.tfz, new Object[] { this.oer.odF }));
              this.ofY.ogg.setTextColor(localContext.getResources().getColor(a.c.smC));
              GMTrace.o(7863279812608L, 58586);
              return;
            }
            this.ofY.ogg.setText(this.oer.odF);
            this.ofY.ogg.setTextColor(localContext.getResources().getColor(a.c.aOE));
            GMTrace.o(7863279812608L, 58586);
            return;
          }
          if (!bg.nm(this.oer.name))
          {
            this.ofY.ogg.setText(this.oer.name);
            this.ofY.ogg.setTextColor(localContext.getResources().getColor(a.c.smC));
            GMTrace.o(7863279812608L, 58586);
            return;
          }
          this.ofY.ogg.setText("");
          this.ofY.ogg.setTextColor(localContext.getResources().getColor(a.c.aOE));
        }
        GMTrace.o(7863279812608L, 58586);
        return;
      }
      this.ofY.oge.setText("");
      w.d(c.TAG, "editTv.setText null");
      this.ofY.ogg.setText("");
      GMTrace.o(7863279812608L, 58586);
    }
    
    public final void gS(boolean paramBoolean)
    {
      GMTrace.i(7863414030336L, 58587);
      w.d(c.TAG, "needSetInput: %s", new Object[] { Boolean.valueOf(paramBoolean) });
      Object localObject1 = com.tencent.mm.plugin.recharge.a.a.baj().bak();
      Object localObject2;
      com.tencent.mm.plugin.recharge.model.a locala;
      if (localObject1 == null)
      {
        localObject2 = new ArrayList();
        locala = com.tencent.mm.plugin.recharge.a.a.bal();
        localObject1 = localObject2;
        if (locala != null)
        {
          ((List)localObject2).add(locala);
          com.tencent.mm.plugin.recharge.a.a.baj().a(locala);
          localObject1 = localObject2;
        }
      }
      for (;;)
      {
        this.ofZ.bi((List)localObject1);
        if ((localObject1 != null) && (((List)localObject1).size() > 0) && (paramBoolean))
        {
          this.oer = ((com.tencent.mm.plugin.recharge.model.a)((List)localObject1).get(0));
          b(this.oer);
        }
        GMTrace.o(7863414030336L, 58587);
        return;
        localObject2 = (String)h.xy().xh().get(6, null);
        int i = 0;
        if (i < ((List)localObject1).size())
        {
          locala = (com.tencent.mm.plugin.recharge.model.a)((List)localObject1).get(i);
          if ((!bg.nm(locala.odE)) && (locala.odE.equals(localObject2))) {
            if ((bg.nm(locala.name)) || (!locala.name.equals(this.ofY.getContext().getString(a.i.tfF))))
            {
              locala.name = this.ofY.getContext().getString(a.i.tfF);
              label255:
              break label310;
            }
          }
          for (;;)
          {
            com.tencent.mm.plugin.recharge.a.a.baj().bi((List)localObject1);
            do
            {
              i += 1;
              break;
            } while ((bg.nm(locala.odE)) || (!bg.nm(locala.name)) || (this.oeq == null));
            Iterator localIterator = this.oeq.iterator();
            label310:
            if (localIterator.hasNext())
            {
              String[] arrayOfString = (String[])localIterator.next();
              if (!locala.odE.equals(com.tencent.mm.plugin.recharge.model.b.Fp(arrayOfString[2]))) {
                break label255;
              }
              locala.name = arrayOfString[1];
              w.i(c.TAG, "add name: %s", new Object[] { arrayOfString[1] });
            }
          }
        }
      }
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\recharge\ui\form\c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */