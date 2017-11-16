package com.tencent.mm.plugin.ipcall.ui;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.graphics.Paint;
import android.graphics.Typeface;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.View.OnLongClickListener;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.RelativeLayout.LayoutParams;
import android.widget.TextView;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.R.a;
import com.tencent.mm.R.l;
import com.tencent.mm.plugin.ipcall.a.i;
import com.tencent.mm.plugin.ipcall.b.a;
import com.tencent.mm.plugin.report.service.g;
import com.tencent.mm.protocal.c.bqi;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ae;
import com.tencent.mm.sdk.platformtools.af;
import com.tencent.mm.sdk.platformtools.an;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.ui.MMActivity;
import java.util.Iterator;
import java.util.LinkedList;

public final class b
{
  public MMActivity ezR;
  public String gnY;
  public TextView hrh;
  public boolean mnA;
  private Runnable mnB;
  private af mnC;
  public boolean mnD;
  private TextWatcher mnE;
  public String mnF;
  public a mnk;
  private DialPad mnl;
  public TextView mnm;
  public EditText mnn;
  public View mno;
  private ImageButton mnp;
  public View mnq;
  public TextView mnr;
  public TextView mns;
  private an mnt;
  public String mnu;
  public String mnv;
  public String mnw;
  public String mnx;
  public LinkedList<bqi> mny;
  public long mnz;
  
  public b(MMActivity paramMMActivity, EditText paramEditText, TextView paramTextView1, View paramView1, DialPad paramDialPad, ImageButton paramImageButton, TextView paramTextView2, View paramView2, TextView paramTextView3, TextView paramTextView4)
  {
    GMTrace.i(15068892758016L, 112272);
    this.mnw = "";
    this.mnz = 0L;
    this.mnA = false;
    this.mnB = new Runnable()
    {
      public final void run()
      {
        GMTrace.i(11719757791232L, 87319);
        if (System.currentTimeMillis() - b.this.mnz >= 500L)
        {
          b.this.mnx = a.ah(b.this.ezR, b.this.mnv + b.this.mnw);
          af.t(new Runnable()
          {
            public final void run()
            {
              GMTrace.i(11651038314496L, 86807);
              if ((this.mnH != null) && (this.mnH.vmr != -1L))
              {
                b.this.hrh.setText(this.mnH.field_systemAddressBookUsername);
                GMTrace.o(11651038314496L, 86807);
                return;
              }
              b.this.hrh.setText("");
              GMTrace.o(11651038314496L, 86807);
            }
          });
          GMTrace.o(11719757791232L, 87319);
          return;
        }
        af.t(new Runnable()
        {
          public final void run()
          {
            GMTrace.i(11678150295552L, 87009);
            b.this.hrh.setText("");
            b.this.mnx = null;
            b.this.gnY = null;
            GMTrace.o(11678150295552L, 87009);
          }
        });
        GMTrace.o(11719757791232L, 87319);
      }
    };
    this.mnC = new af("IPCallDialQueryPhoneNumber");
    this.mnD = false;
    this.mnE = new TextWatcher()
    {
      public final void afterTextChanged(Editable paramAnonymousEditable)
      {
        GMTrace.i(11727945072640L, 87380);
        paramAnonymousEditable = b.this.mnm.getText().toString().replace("+", "");
        if ((paramAnonymousEditable.startsWith("0")) || (paramAnonymousEditable.startsWith("*")) || (paramAnonymousEditable.startsWith("#")))
        {
          b.this.mnm.setText("+");
          b.this.mnv = "+";
        }
        GMTrace.o(11727945072640L, 87380);
      }
      
      public final void beforeTextChanged(CharSequence paramAnonymousCharSequence, int paramAnonymousInt1, int paramAnonymousInt2, int paramAnonymousInt3)
      {
        GMTrace.i(11727676637184L, 87378);
        GMTrace.o(11727676637184L, 87378);
      }
      
      public final void onTextChanged(CharSequence paramAnonymousCharSequence, int paramAnonymousInt1, int paramAnonymousInt2, int paramAnonymousInt3)
      {
        GMTrace.i(11727810854912L, 87379);
        if (b.this.mnq.getLayoutParams() != null)
        {
          paramAnonymousCharSequence = b.this.mnm.getPaint();
          if ("+".equals(b.this.mnm.getText().toString()))
          {
            paramAnonymousInt1 = (int)paramAnonymousCharSequence.measureText(b.this.mnm.getText().toString());
            b.this.mno.setVisibility(8);
            b.this.mnr.setVisibility(8);
            paramAnonymousCharSequence = (RelativeLayout.LayoutParams)b.this.mnq.getLayoutParams();
            paramAnonymousCharSequence.width = paramAnonymousInt1;
            b.this.mnq.setLayoutParams(paramAnonymousCharSequence);
          }
        }
        else
        {
          paramAnonymousCharSequence = b.this.mnm.getText().toString().replace("+", "");
          if (!a.AM(paramAnonymousCharSequence)) {
            break label368;
          }
          b.this.mnr.setText(a.AJ(paramAnonymousCharSequence));
          if ((b.this.mny == null) || (b.this.mny.size() <= 0)) {
            break label391;
          }
          String str = a.AK(paramAnonymousCharSequence);
          Iterator localIterator = b.this.mny.iterator();
          while (localIterator.hasNext())
          {
            bqi localbqi = (bqi)localIterator.next();
            if ((localbqi != null) && (localbqi.gCG.equals(str)))
            {
              paramAnonymousInt1 = 1;
              label257:
              if (paramAnonymousInt1 == 0) {
                break label396;
              }
              b.this.mns.setVisibility(0);
            }
          }
        }
        for (;;)
        {
          if (b.this.mnk != null) {
            b.this.mnk.As(paramAnonymousCharSequence);
          }
          GMTrace.o(11727810854912L, 87379);
          return;
          paramAnonymousInt1 = (int)paramAnonymousCharSequence.measureText(b.this.mnm.getText() + "+");
          b.this.mno.setVisibility(0);
          b.this.mnr.setVisibility(0);
          break;
          paramAnonymousInt1 = 0;
          break label257;
          label368:
          b.this.mnr.setText(b.this.ezR.getString(R.l.dEe));
          label391:
          paramAnonymousInt1 = 0;
          break label257;
          label396:
          b.this.mns.setVisibility(8);
        }
      }
    };
    this.mnF = "";
    this.ezR = paramMMActivity;
    this.mnn = paramEditText;
    this.mnm = paramTextView1;
    this.mno = paramView1;
    this.mnl = paramDialPad;
    this.mnp = paramImageButton;
    this.hrh = paramTextView2;
    this.mnq = paramView2;
    this.mnr = paramTextView3;
    this.mns = paramTextView4;
    this.mnt = new an();
    this.mnv = com.tencent.mm.plugin.ipcall.b.c.aJG();
    paramMMActivity = ab.getContext().getSharedPreferences("IPCall_LastInputPref", 0).getString("IPCall_LastInputCountryName", "");
    if (!bg.nm(paramMMActivity)) {}
    for (;;)
    {
      this.mnu = paramMMActivity;
      this.mnm.addTextChangedListener(this.mnE);
      this.mnm.setText("+" + this.mnv);
      this.mnl.mnj = new DialPad.a()
      {
        public final void Ap(String paramAnonymousString)
        {
          GMTrace.i(11647414435840L, 86780);
          b.this.mnw = b.this.mnn.getText().toString();
          if (b.this.mnA)
          {
            b.this.mnv += paramAnonymousString;
            b.this.mnm.setText(b.this.mnv);
            if ((a.AM(b.this.mnv.replace("+", ""))) || (b.this.mnv.replace("+", "").length() >= 4))
            {
              g.ork.i(12061, new Object[] { Integer.valueOf(0), Integer.valueOf(0), Integer.valueOf(0), Integer.valueOf(0), Integer.valueOf(1), Integer.valueOf(0) });
              b.this.mnA = false;
              b.this.mnu = a.AJ(b.this.mnv.replace("+", ""));
              b.this.mnw = b.this.cE(b.this.mnv.replace("+", ""), b.this.mnw);
              b.this.bi(b.this.mnw, -1);
              GMTrace.o(11647414435840L, 86780);
            }
          }
          else
          {
            String str = b.this.mnm.getText().toString().replace("+", "");
            if (!b.this.mnD) {
              break label740;
            }
            StringBuffer localStringBuffer = new StringBuffer(b.this.mnw);
            localStringBuffer.insert(b.this.mnn.getSelectionStart(), paramAnonymousString);
            b.this.mnw = localStringBuffer.toString();
            if (b.this.mnw.equals("00"))
            {
              b.this.mnm.setText("+");
              b.this.mnA = true;
              b.this.mnv = "+";
              b.this.mnw = "";
            }
            if (a.AM(b.this.mnv.replace("+", "") + b.this.mnw))
            {
              b.this.mnm.setText("+" + b.this.mnv.replace("+", "") + b.this.mnw);
              b.this.mnu = a.AJ(b.this.mnv.replace("+", ""));
              b.this.mnA = false;
              b.this.mnv = (b.this.mnv.replace("+", "") + b.this.mnw);
              b.this.mnw = "";
            }
            paramAnonymousString = b.this.mnw;
            b.this.mnw = b.this.cE(str, b.this.mnw);
            if (!b.this.mnD) {
              break label882;
            }
            if (paramAnonymousString.length() >= b.this.mnw.length()) {
              break label774;
            }
            b.this.bi(b.this.mnw, b.this.mnn.getSelectionEnd() + 2);
          }
          for (;;)
          {
            b.this.mnz = System.currentTimeMillis();
            if ((b.this.mnw.length() > a.mut) && (!bg.nm(b.this.mnv + b.this.mnw))) {
              b.this.aJc();
            }
            GMTrace.o(11647414435840L, 86780);
            return;
            label740:
            b.this.mnw += paramAnonymousString;
            break;
            label774:
            if (paramAnonymousString.length() == b.this.mnw.length())
            {
              b.this.bi(b.this.mnw, b.this.mnn.getSelectionEnd() + 1);
            }
            else if (paramAnonymousString.length() > b.this.mnw.length())
            {
              b.this.bi(b.this.mnw, b.this.mnn.getSelectionEnd() + 1 - (paramAnonymousString.length() - b.this.mnw.length()));
              continue;
              label882:
              b.this.bi(b.this.mnw, -1);
            }
          }
        }
        
        public final void Aq(String paramAnonymousString)
        {
          GMTrace.i(11647548653568L, 86781);
          if (paramAnonymousString.equals("0"))
          {
            b.this.mnm.setText("+");
            b.this.mnA = true;
            b.this.mnv = "+";
          }
          GMTrace.o(11647548653568L, 86781);
        }
      };
      this.mno.setOnClickListener(new View.OnClickListener()
      {
        public final void onClick(View paramAnonymousView)
        {
          GMTrace.i(11629831913472L, 86649);
          paramAnonymousView = b.this.mnn.getText().toString();
          if (bg.nm(paramAnonymousView))
          {
            paramAnonymousView = b.this.mnm.getText().toString();
            if (!bg.nm(paramAnonymousView))
            {
              paramAnonymousView = paramAnonymousView.substring(0, paramAnonymousView.length() - 1);
              if ((!bg.nm(paramAnonymousView)) && (!paramAnonymousView.equals("+")))
              {
                b.this.mnm.setText(paramAnonymousView);
                b.this.mnv = paramAnonymousView;
                GMTrace.o(11629831913472L, 86649);
                return;
              }
              b.this.mnm.setText("+");
              b.this.mnv = "+";
              b.this.mnA = true;
            }
            GMTrace.o(11629831913472L, 86649);
            return;
          }
          int i = b.this.mnn.getSelectionStart();
          String str;
          if ((b.this.mnD) && (i - 1 >= 0))
          {
            paramAnonymousView = b.this.mnn.getText();
            paramAnonymousView.delete(i - 1, i);
            paramAnonymousView = paramAnonymousView.toString();
            if (bg.nm(paramAnonymousView)) {
              break label384;
            }
            str = b.this.mnm.getText().toString().replace("+", "");
            if (!b.this.mnD) {
              break label349;
            }
            b.this.mnw = b.this.cE(str, paramAnonymousView);
            int j = b.this.mnw.length();
            int k = paramAnonymousView.length();
            b.this.bi(b.this.mnw, j - k + (i - 1));
            label297:
            b.this.aJc();
          }
          for (;;)
          {
            b.this.mnx = "";
            b.this.hrh.setText("");
            GMTrace.o(11629831913472L, 86649);
            return;
            paramAnonymousView = paramAnonymousView.substring(0, paramAnonymousView.length() - 1);
            break;
            label349:
            b.this.mnw = b.this.cE(str, paramAnonymousView);
            b.this.bi(b.this.mnw, -1);
            break label297;
            label384:
            b.this.mnw = "";
            b.this.bi("", -1);
          }
        }
      });
      this.mno.setOnLongClickListener(new View.OnLongClickListener()
      {
        public final boolean onLongClick(View paramAnonymousView)
        {
          GMTrace.i(11632918921216L, 86672);
          if (b.this.mnA)
          {
            b.this.mnv = "+";
            b.this.mnm.setText(b.this.mnv);
          }
          for (;;)
          {
            GMTrace.o(11632918921216L, 86672);
            return true;
            b.this.hrh.setText("");
            b.this.mnw = "";
            b.this.bi("", -1);
          }
        }
      });
      this.mnm.setOnClickListener(new View.OnClickListener()
      {
        public final void onClick(View paramAnonymousView)
        {
          GMTrace.i(11721502621696L, 87332);
          g.ork.i(12061, new Object[] { Integer.valueOf(0), Integer.valueOf(0), Integer.valueOf(0), Integer.valueOf(1), Integer.valueOf(0), Integer.valueOf(0) });
          paramAnonymousView = b.this.mnm.getText().toString().replace("+", "");
          Intent localIntent = new Intent(b.this.ezR, IPCallCountryCodeSelectUI.class);
          localIntent.putExtra("couttry_code", paramAnonymousView);
          localIntent.putExtra("CountryCodeUI_isShowCountryCode", true);
          b.this.ezR.startActivityForResult(localIntent, 100);
          b.this.ezR.overridePendingTransition(R.a.aLG, -1);
          GMTrace.o(11721502621696L, 87332);
        }
      });
      this.mnp.setOnClickListener(new View.OnClickListener()
      {
        public final void onClick(View paramAnonymousView)
        {
          GMTrace.i(11727408201728L, 87376);
          b localb = b.this;
          localb.mnv = localb.mnm.getText().toString();
          localb.mnw = localb.mnn.getText().toString();
          if ((!bg.nm(localb.mnv)) && (!bg.nm(localb.mnw)))
          {
            localb.mnv = localb.mnm.getText().toString().replace("+", "");
            localb.mnx = a.ah(localb.ezR, localb.mnv + localb.mnw);
            localb.gnY = a.aj(localb.ezR, localb.mnx);
            paramAnonymousView = com.tencent.mm.plugin.ipcall.b.c.AT(localb.mnw);
            Object localObject = ab.getContext().getSharedPreferences("IPCall_LastInputPref", 0).edit();
            ((SharedPreferences.Editor)localObject).putString("IPCall_LastInputPhoneNumber", paramAnonymousView);
            ((SharedPreferences.Editor)localObject).apply();
            String str = localb.mnm.getText().toString();
            localObject = localb.mnu;
            if (!bg.nm(str))
            {
              paramAnonymousView = (View)localObject;
              if (bg.nm((String)localObject)) {
                paramAnonymousView = "";
              }
              localObject = ab.getContext().getSharedPreferences("IPCall_LastInputPref", 0).edit();
              ((SharedPreferences.Editor)localObject).putString("IPCall_LastInputCountryCode", str.replace("+", ""));
              ((SharedPreferences.Editor)localObject).putString("IPCall_LastInputCountryName", paramAnonymousView);
              ((SharedPreferences.Editor)localObject).apply();
            }
            if (localb.mnk != null)
            {
              localb.mnk.g(localb.mnv, com.tencent.mm.plugin.ipcall.b.c.AT(localb.mnw), localb.mnx, localb.gnY);
              GMTrace.o(11727408201728L, 87376);
            }
          }
          else
          {
            paramAnonymousView = ab.getContext().getSharedPreferences("IPCall_LastInputPref", 0).getString("IPCall_LastInputPhoneNumber", "");
            if (!bg.nm(paramAnonymousView))
            {
              paramAnonymousView = com.tencent.mm.plugin.ipcall.b.c.AT(paramAnonymousView);
              localb.mnw = localb.cE(localb.mnm.getText().toString().replace("+", ""), paramAnonymousView);
              localb.bi(localb.mnw, -1);
              localb.aJc();
            }
          }
          GMTrace.o(11727408201728L, 87376);
        }
      });
      this.mnn.setHorizontallyScrolling(true);
      this.mnn.setOnClickListener(new View.OnClickListener()
      {
        public final void onClick(View paramAnonymousView)
        {
          GMTrace.i(11648353959936L, 86787);
          b.this.mnn.setCursorVisible(true);
          b.this.ezR.aLo();
          b.this.mnD = true;
          GMTrace.o(11648353959936L, 86787);
        }
      });
      this.mnn.addTextChangedListener(new TextWatcher()
      {
        public final void afterTextChanged(Editable paramAnonymousEditable)
        {
          GMTrace.i(11626879123456L, 86627);
          GMTrace.o(11626879123456L, 86627);
        }
        
        public final void beforeTextChanged(CharSequence paramAnonymousCharSequence, int paramAnonymousInt1, int paramAnonymousInt2, int paramAnonymousInt3)
        {
          GMTrace.i(11626744905728L, 86626);
          GMTrace.o(11626744905728L, 86626);
        }
        
        public final void onTextChanged(CharSequence paramAnonymousCharSequence, int paramAnonymousInt1, int paramAnonymousInt2, int paramAnonymousInt3)
        {
          GMTrace.i(11626610688000L, 86625);
          String str = bg.AT(paramAnonymousCharSequence.toString());
          if (str.contains(" "))
          {
            paramAnonymousCharSequence = str.replace(" ", "");
            b.this.mnn.setText(bg.M(paramAnonymousCharSequence));
            if (!a.AN(paramAnonymousCharSequence)) {
              break label220;
            }
            str = a.AL(paramAnonymousCharSequence);
            if (!bg.nm(str))
            {
              b.this.mnm.setText("+" + str);
              b.this.mnn.setText(a.AQ(paramAnonymousCharSequence));
            }
          }
          for (;;)
          {
            if (b.this.mnk != null) {
              b.this.mnk.At(b.this.mnn.getText().toString());
            }
            GMTrace.o(11626610688000L, 86625);
            return;
            if (b.this.mnF.equals(str))
            {
              paramAnonymousCharSequence = str;
              if (paramAnonymousInt3 <= 0) {
                break;
              }
            }
            paramAnonymousCharSequence = str;
            if (!bg.nm(str)) {
              break;
            }
            b.this.mnF = str;
            b.this.mnn.setText("");
            paramAnonymousCharSequence = str;
            break;
            label220:
            if (!paramAnonymousCharSequence.equals(b.this.mnF))
            {
              b.this.mnF = paramAnonymousCharSequence;
              b.this.mnn.setText(paramAnonymousCharSequence);
              if (bg.nm(b.this.mnm.getText().toString())) {
                b.this.mnm.setText("+" + a.aJD());
              }
            }
          }
        }
      });
      if (com.tencent.mm.compatible.util.d.et(16))
      {
        this.mnm.setTypeface(Typeface.create("sans-serif-light", 0));
        this.mnn.setTypeface(Typeface.create("sans-serif-light", 0));
        this.hrh.setTypeface(Typeface.create("sans-serif-light", 0));
      }
      GMTrace.o(15068892758016L, 112272);
      return;
      paramMMActivity = a.AJ(a.aJD());
    }
  }
  
  public final void Ar(String paramString)
  {
    GMTrace.i(11633187356672L, 86674);
    this.mnv = paramString;
    if (this.mnm != null) {
      this.mnm.setText("+" + paramString);
    }
    GMTrace.o(11633187356672L, 86674);
  }
  
  public final void X(LinkedList<bqi> paramLinkedList)
  {
    GMTrace.i(15069026975744L, 112273);
    this.mny = paramLinkedList;
    paramLinkedList = this.mnm.getText().toString().replace("+", "");
    if ((a.AM(paramLinkedList)) && (this.mny != null) && (this.mny.size() > 0))
    {
      paramLinkedList = a.AK(paramLinkedList);
      Iterator localIterator = this.mny.iterator();
      bqi localbqi;
      do
      {
        if (!localIterator.hasNext()) {
          break;
        }
        localbqi = (bqi)localIterator.next();
      } while ((localbqi == null) || (!localbqi.gCG.equals(paramLinkedList)));
    }
    for (int i = 1;; i = 0)
    {
      if (i != 0)
      {
        this.mns.setVisibility(0);
        GMTrace.o(15069026975744L, 112273);
        return;
      }
      this.mns.setVisibility(8);
      GMTrace.o(15069026975744L, 112273);
      return;
    }
  }
  
  public final void aJc()
  {
    GMTrace.i(11633590009856L, 86677);
    this.mnC.bQi().removeCallbacks(this.mnB);
    this.mnC.h(this.mnB, 500L);
    GMTrace.o(11633590009856L, 86677);
  }
  
  public final void bi(String paramString, int paramInt)
  {
    GMTrace.i(11633455792128L, 86676);
    this.mnn.setText(paramString);
    if (!bg.nm(paramString))
    {
      if (paramInt == -1) {
        break label79;
      }
      if (this.mnD)
      {
        if ((paramInt <= 0) || (paramInt > this.mnn.getText().length())) {
          break label79;
        }
        this.mnn.setSelection(paramInt);
      }
    }
    for (;;)
    {
      this.mnw = paramString;
      GMTrace.o(11633455792128L, 86676);
      return;
      label79:
      this.mnn.setSelection(this.mnn.getText().length());
    }
  }
  
  public final String cE(String paramString1, String paramString2)
  {
    GMTrace.i(11633321574400L, 86675);
    paramString1 = an.formatNumber(paramString1, com.tencent.mm.plugin.ipcall.b.c.AT(paramString2));
    if (bg.nm(paramString1))
    {
      GMTrace.o(11633321574400L, 86675);
      return paramString2;
    }
    GMTrace.o(11633321574400L, 86675);
    return paramString1;
  }
  
  public static abstract interface a
  {
    public abstract void As(String paramString);
    
    public abstract void At(String paramString);
    
    public abstract void g(String paramString1, String paramString2, String paramString3, String paramString4);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\ipcall\ui\b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */