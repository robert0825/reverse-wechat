package com.tencent.mm.plugin.recharge.ui;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.telephony.PhoneNumberUtils;
import android.text.Editable;
import android.text.InputFilter;
import android.text.InputFilter.LengthFilter;
import android.text.SpannableStringBuilder;
import android.text.TextWatcher;
import android.text.method.NumberKeyListener;
import android.text.style.ForegroundColorSpan;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.View.OnFocusChangeListener;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.AutoCompleteTextView;
import android.widget.BaseAdapter;
import android.widget.Filter;
import android.widget.Filter.FilterResults;
import android.widget.Filterable;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.kernel.e;
import com.tencent.mm.kernel.h;
import com.tencent.mm.plugin.recharge.model.b;
import com.tencent.mm.plugin.wxpay.a.c;
import com.tencent.mm.plugin.wxpay.a.d;
import com.tencent.mm.plugin.wxpay.a.e;
import com.tencent.mm.plugin.wxpay.a.f;
import com.tencent.mm.plugin.wxpay.a.g;
import com.tencent.mm.plugin.wxpay.a.i;
import com.tencent.mm.plugin.wxpay.a.k;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.storage.t;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class MallEditText
  extends LinearLayout
  implements View.OnFocusChangeListener
{
  private int gravity;
  private TextView hrh;
  private View.OnFocusChangeListener hvh;
  ImageView hvk;
  private String hvl;
  String hvm;
  int hvn;
  public boolean hvp;
  boolean hvr;
  private int hvs;
  private int hvt;
  private int imeOptions;
  private int inputType;
  b oel;
  AutoCompleteTextView oem;
  boolean oen;
  private a oeo;
  private boolean oep;
  private List<String[]> oeq;
  private com.tencent.mm.plugin.recharge.model.a oer;
  private Runnable oes;
  private boolean oet;
  private int oeu;
  
  public MallEditText(Context paramContext, AttributeSet paramAttributeSet)
  {
    this(paramContext, paramAttributeSet, 0);
    GMTrace.i(7889318051840L, 58780);
    GMTrace.o(7889318051840L, 58780);
  }
  
  public MallEditText(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet);
    GMTrace.i(7889183834112L, 58779);
    this.oeo = null;
    this.hvl = "";
    this.hvm = "";
    this.inputType = 1;
    this.oep = true;
    this.hvt = -1;
    this.hvs = 1;
    this.gravity = 19;
    this.hvn = -1;
    this.hvr = false;
    this.oer = null;
    this.hvp = true;
    this.oes = null;
    this.oet = false;
    this.oeu = 0;
    paramAttributeSet = paramContext.obtainStyledAttributes(paramAttributeSet, a.k.tiE, paramInt, 0);
    paramInt = paramAttributeSet.getResourceId(a.k.tiM, 0);
    if (paramInt != 0) {
      this.hvl = paramContext.getString(paramInt);
    }
    paramInt = paramAttributeSet.getResourceId(a.k.tiN, 0);
    if (paramInt != 0) {
      this.hvm = paramContext.getString(paramInt);
    }
    this.inputType = paramAttributeSet.getInteger(a.k.tiJ, 1);
    this.hvp = paramAttributeSet.getBoolean(a.k.tiG, true);
    this.gravity = paramAttributeSet.getInt(a.k.tiH, 19);
    this.oep = paramAttributeSet.getBoolean(a.k.tiF, true);
    this.hvt = paramAttributeSet.getInteger(a.k.tiK, -1);
    this.hvn = paramAttributeSet.getInteger(a.k.tiL, 0);
    this.imeOptions = paramAttributeSet.getInteger(a.k.tiI, 5);
    paramAttributeSet.recycle();
    paramAttributeSet = LayoutInflater.from(paramContext).inflate(a.g.sOm, this, true);
    this.hrh = ((TextView)paramAttributeSet.findViewById(a.f.cjN));
    this.oem = ((AutoCompleteTextView)paramAttributeSet.findViewById(a.f.bGe));
    if (com.tencent.mm.br.a.ed(paramContext))
    {
      this.oem.setTextSize(0, paramContext.getResources().getDimensionPixelSize(a.d.aQF) * 1.25F);
      label306:
      this.hvk = ((ImageView)paramAttributeSet.findViewById(a.f.bHp));
      w.d("MicroMsg.MallEditText", "setFormat editType:" + this.hvn);
      this.oem.setImeOptions(this.imeOptions);
      switch (this.hvn)
      {
      default: 
        label384:
        this.inputType = 1;
        label389:
        this.oem.addTextChangedListener(new TextWatcher()
        {
          public final void afterTextChanged(Editable paramAnonymousEditable)
          {
            GMTrace.i(7887841656832L, 58769);
            GMTrace.o(7887841656832L, 58769);
          }
          
          public final void beforeTextChanged(CharSequence paramAnonymousCharSequence, int paramAnonymousInt1, int paramAnonymousInt2, int paramAnonymousInt3)
          {
            GMTrace.i(7887707439104L, 58768);
            GMTrace.o(7887707439104L, 58768);
          }
          
          public final void onTextChanged(CharSequence paramAnonymousCharSequence, int paramAnonymousInt1, int paramAnonymousInt2, int paramAnonymousInt3)
          {
            GMTrace.i(7887573221376L, 58767);
            String str = paramAnonymousCharSequence.toString();
            paramAnonymousInt2 = MallEditText.a(MallEditText.this).getSelectionStart();
            paramAnonymousCharSequence = "";
            paramAnonymousInt1 = paramAnonymousInt2;
            int i;
            if (str != null)
            {
              paramAnonymousCharSequence = new StringBuilder(str.replaceAll(" ", ""));
              paramAnonymousInt1 = paramAnonymousCharSequence.length();
              if (paramAnonymousInt1 >= 4) {
                paramAnonymousCharSequence.insert(3, ' ');
              }
              if (paramAnonymousInt1 >= 8) {
                paramAnonymousCharSequence.insert(8, ' ');
              }
              paramAnonymousCharSequence = paramAnonymousCharSequence.toString();
              i = paramAnonymousCharSequence.length();
              if (i <= MallEditText.b(MallEditText.this)) {
                break label221;
              }
              if (((paramAnonymousInt2 != 4) && (paramAnonymousInt2 != 9)) || (paramAnonymousInt3 != 1)) {
                break label192;
              }
              paramAnonymousInt1 = paramAnonymousInt2 + 1;
            }
            for (;;)
            {
              MallEditText.a(MallEditText.this, i);
              if (str.equals(paramAnonymousCharSequence)) {
                break label281;
              }
              MallEditText.a(MallEditText.this).setText(paramAnonymousCharSequence);
              if (paramAnonymousInt1 >= MallEditText.b(MallEditText.this)) {
                break;
              }
              MallEditText.a(MallEditText.this).setSelection(paramAnonymousInt1);
              GMTrace.o(7887573221376L, 58767);
              return;
              label192:
              if (paramAnonymousInt2 != 4)
              {
                paramAnonymousInt1 = paramAnonymousInt2;
                if (paramAnonymousInt2 != 9) {}
              }
              else
              {
                paramAnonymousInt1 = paramAnonymousInt2;
                if (paramAnonymousInt3 > 1)
                {
                  paramAnonymousInt1 = paramAnonymousInt2 + paramAnonymousInt3;
                  continue;
                  label221:
                  paramAnonymousInt1 = paramAnonymousInt2;
                  if (i < MallEditText.b(MallEditText.this)) {
                    if (paramAnonymousInt2 != 4)
                    {
                      paramAnonymousInt1 = paramAnonymousInt2;
                      if (paramAnonymousInt2 != 9) {}
                    }
                    else
                    {
                      paramAnonymousInt1 = paramAnonymousInt2 - 1;
                    }
                  }
                }
              }
            }
            MallEditText.a(MallEditText.this).setSelection(MallEditText.b(MallEditText.this));
            GMTrace.o(7887573221376L, 58767);
            return;
            label281:
            MallEditText.c(MallEditText.this);
            GMTrace.o(7887573221376L, 58767);
          }
        });
        this.oem.setOnFocusChangeListener(this);
        if (!bg.nm(this.hvl)) {
          this.oem.setHint(this.hvl);
        }
        if (this.inputType == 2)
        {
          this.oem.setKeyListener(new NumberKeyListener()
          {
            protected final char[] getAcceptedChars()
            {
              GMTrace.i(7877775327232L, 58694);
              GMTrace.o(7877775327232L, 58694);
              return new char[] { 49, 50, 51, 52, 53, 54, 55, 56, 57, 48, 32 };
            }
            
            public final int getInputType()
            {
              GMTrace.i(7877641109504L, 58693);
              GMTrace.o(7877641109504L, 58693);
              return 3;
            }
          });
          label456:
          this.oem.setGravity(this.gravity);
          if (!this.oep)
          {
            this.oem.setEnabled(false);
            this.oem.setTextColor(getResources().getColor(a.c.black));
            this.oem.setFocusable(false);
            this.oem.setClickable(false);
          }
          if (this.hvp) {
            break label748;
          }
          this.hvr = true;
          this.oem.setEnabled(false);
          this.oem.setFocusable(false);
          this.oem.setClickable(false);
        }
        break;
      }
    }
    for (;;)
    {
      if (this.hvt != -1) {
        this.oem.setFilters(new InputFilter[] { new InputFilter.LengthFilter(this.hvt) });
      }
      w.d("MicroMsg.MallEditText", "initData editType:" + this.hvn);
      switch (this.hvn)
      {
      default: 
        GMTrace.o(7889183834112L, 58779);
        return;
        this.oem.setTextSize(0, com.tencent.mm.br.a.V(paramContext, a.d.aQF));
        break label306;
        this.hvs = 13;
        this.hvt = 13;
        this.inputType = 2;
        tc(a.e.soR);
        this.hvk.setVisibility(0);
        break label389;
        if (this.hvp) {
          break label384;
        }
        this.hvk.setImageResource(a.e.sow);
        this.hvk.setVisibility(0);
        break label384;
        this.oem.setInputType(this.inputType);
        this.oem.setRawInputType(this.inputType);
        break label456;
        label748:
        this.hvr = false;
      }
    }
    w.d("MicroMsg.MallEditText", "setMobileEditTv");
    paramContext = com.tencent.mm.plugin.recharge.a.a.baj().bak();
    this.oeo = new a((byte)0);
    this.oeo.bi(paramContext);
    if ((paramContext != null) && (paramContext.size() > 0))
    {
      this.oer = ((com.tencent.mm.plugin.recharge.model.a)paramContext.get(0));
      b(this.oer);
    }
    for (;;)
    {
      if ((paramContext == null) || (paramContext.size() == 0))
      {
        h.xz();
        paramContext = (String)h.xy().xh().get(6, null);
        this.oem.setText(paramContext);
        this.oem.setSelection(this.oem.getText().length());
        ban();
      }
      this.oem.setAdapter(this.oeo);
      this.oem.setOnItemClickListener(new AdapterView.OnItemClickListener()
      {
        public final void onItemClick(AdapterView<?> paramAnonymousAdapterView, View paramAnonymousView, int paramAnonymousInt, long paramAnonymousLong)
        {
          GMTrace.i(7888110092288L, 58771);
          MallEditText.a(MallEditText.this, MallEditText.d(MallEditText.this).td(paramAnonymousInt));
          if (MallEditText.e(MallEditText.this) != null)
          {
            w.d("MicroMsg.MallEditText", "onItemClick record.record " + MallEditText.e(MallEditText.this).odE + ", record.name " + MallEditText.e(MallEditText.this).name);
            MallEditText.this.b(MallEditText.e(MallEditText.this));
          }
          MallEditText.a(MallEditText.this).dismissDropDown();
          GMTrace.o(7888110092288L, 58771);
        }
      });
      break;
      if (this.oeq == null) {
        new Runnable()
        {
          public final void run()
          {
            GMTrace.i(7880325464064L, 58713);
            try
            {
              MallEditText.a(MallEditText.this, com.tencent.mm.pluginsdk.a.dC(MallEditText.this.getContext()));
              GMTrace.o(7880325464064L, 58713);
              return;
            }
            catch (Exception localException)
            {
              w.printErrStackTrace("MicroMsg.MallEditText", localException, "", new Object[0]);
              GMTrace.o(7880325464064L, 58713);
            }
          }
        }.run();
      }
    }
  }
  
  private void ban()
  {
    GMTrace.i(7889720705024L, 58783);
    boolean bool = QW();
    if (bool != this.hvr)
    {
      w.d("MicroMsg.MallEditText", "View:" + this.hvm + ", editType:" + this.hvn + " inputValid change to " + bool);
      this.hvr = bool;
      if (this.oel != null) {
        this.oel.gR(this.hvr);
      }
      if (!bool)
      {
        if (this.hrh.getVisibility() == 0)
        {
          this.hrh.setText("");
          this.hrh.setVisibility(8);
        }
        this.oer = null;
      }
    }
    if (this.oel != null) {
      this.oel.bap();
    }
    GMTrace.o(7889720705024L, 58783);
  }
  
  public final boolean QW()
  {
    GMTrace.i(7889989140480L, 58785);
    switch (this.hvn)
    {
    default: 
      if (this.oem.getText().length() >= this.hvs)
      {
        GMTrace.o(7889989140480L, 58785);
        return true;
      }
      break;
    case 1: 
      String str = this.oem.getText().toString();
      if ((str.length() >= this.hvs) && (str.length() <= this.hvt) && (PhoneNumberUtils.isGlobalPhoneNumber(b.Fp(str))))
      {
        GMTrace.o(7889989140480L, 58785);
        return true;
      }
      GMTrace.o(7889989140480L, 58785);
      return false;
    }
    GMTrace.o(7889989140480L, 58785);
    return false;
  }
  
  public final void b(com.tencent.mm.plugin.recharge.model.a parama)
  {
    GMTrace.i(7889586487296L, 58782);
    this.oer = parama;
    if (parama != null)
    {
      this.oem.setText(parama.odE);
      this.oem.setSelection(this.oem.getText().length());
      ban();
      w.d("MicroMsg.MallEditText", "editTv.setText " + parama.odE + ", name " + parama.name + ", isInputValid " + this.hvr);
      if ((!bg.nm(parama.name)) && (this.hvr))
      {
        this.hrh.setText(parama.name);
        this.hrh.setVisibility(0);
        GMTrace.o(7889586487296L, 58782);
        return;
      }
      this.hrh.setText("");
      this.hrh.setVisibility(8);
      GMTrace.o(7889586487296L, 58782);
      return;
    }
    this.oem.setText("");
    ban();
    w.d("MicroMsg.MallEditText", "editTv.setText null");
    this.hrh.setText("");
    this.hrh.setVisibility(8);
    GMTrace.o(7889586487296L, 58782);
  }
  
  public final com.tencent.mm.plugin.recharge.model.a bao()
  {
    GMTrace.i(7890660229120L, 58790);
    if (this.oer != null)
    {
      locala = this.oer;
      GMTrace.o(7890660229120L, 58790);
      return locala;
    }
    this.oer = new com.tencent.mm.plugin.recharge.model.a(getText(), this.hrh.getText().toString(), 0);
    com.tencent.mm.plugin.recharge.model.a locala = this.oer;
    GMTrace.o(7890660229120L, 58790);
    return locala;
  }
  
  public final String getText()
  {
    GMTrace.i(7889854922752L, 58784);
    switch (this.hvn)
    {
    default: 
      str = bg.aq(this.oem.getText().toString(), "");
      GMTrace.o(7889854922752L, 58784);
      return str;
    }
    String str = bg.aq(this.oem.getText().toString(), "");
    GMTrace.o(7889854922752L, 58784);
    return str;
  }
  
  public void onFocusChange(View paramView, boolean paramBoolean)
  {
    GMTrace.i(7890526011392L, 58789);
    if (this.hvh != null) {
      this.hvh.onFocusChange(this, paramBoolean);
    }
    if (!this.oet) {}
    for (boolean bool = true;; bool = false)
    {
      if ((bool == paramBoolean) && (!paramBoolean) && (this.oes != null)) {
        this.oes.run();
      }
      this.oet = paramBoolean;
      w.d("MicroMsg.MallEditText", "View:" + this.hvm + ", editType:" + this.hvn + " onFocusChange to " + paramBoolean);
      if (this.oel != null) {
        this.oel.gR(this.hvr);
      }
      GMTrace.o(7890526011392L, 58789);
      return;
    }
  }
  
  public boolean onInterceptTouchEvent(MotionEvent paramMotionEvent)
  {
    GMTrace.i(7890123358208L, 58786);
    if (this.hvp)
    {
      GMTrace.o(7890123358208L, 58786);
      return false;
    }
    GMTrace.o(7890123358208L, 58786);
    return true;
  }
  
  public void setOnClickListener(View.OnClickListener paramOnClickListener)
  {
    GMTrace.i(7890257575936L, 58787);
    super.setOnClickListener(paramOnClickListener);
    this.oem.setOnClickListener(paramOnClickListener);
    GMTrace.o(7890257575936L, 58787);
  }
  
  public void setOnFocusChangeListener(View.OnFocusChangeListener paramOnFocusChangeListener)
  {
    GMTrace.i(7890391793664L, 58788);
    super.setOnFocusChangeListener(paramOnFocusChangeListener);
    this.hvh = paramOnFocusChangeListener;
    GMTrace.o(7890391793664L, 58788);
  }
  
  public final void tc(int paramInt)
  {
    GMTrace.i(7889452269568L, 58781);
    if (paramInt == a.e.aXB) {}
    for (boolean bool = true;; bool = false)
    {
      this.oen = bool;
      this.hvk.setImageResource(paramInt);
      GMTrace.o(7889452269568L, 58781);
      return;
    }
  }
  
  private final class a
    extends BaseAdapter
    implements Filterable
  {
    private String oeA;
    public List<com.tencent.mm.plugin.recharge.model.a> oew;
    public boolean oex;
    private List<com.tencent.mm.plugin.recharge.model.a> oey;
    private a oez;
    
    private a()
    {
      GMTrace.i(7892941930496L, 58807);
      this.oew = new ArrayList();
      this.oex = false;
      GMTrace.o(7892941930496L, 58807);
    }
    
    public final void bi(List<com.tencent.mm.plugin.recharge.model.a> paramList)
    {
      GMTrace.i(7893076148224L, 58808);
      this.oey = paramList;
      this.oew.clear();
      this.oex = false;
      GMTrace.o(7893076148224L, 58808);
    }
    
    public final int getCount()
    {
      GMTrace.i(7893344583680L, 58810);
      int i;
      if (this.oex)
      {
        i = this.oew.size();
        GMTrace.o(7893344583680L, 58810);
        return i + 2;
      }
      if (this.oew.size() > 0)
      {
        i = this.oew.size();
        GMTrace.o(7893344583680L, 58810);
        return i + 1;
      }
      GMTrace.o(7893344583680L, 58810);
      return 0;
    }
    
    public final Filter getFilter()
    {
      GMTrace.i(7893210365952L, 58809);
      w.d("MicroMsg.MallEditText", "getFilter");
      if (this.oez == null) {
        this.oez = new a((byte)0);
      }
      a locala = this.oez;
      GMTrace.o(7893210365952L, 58809);
      return locala;
    }
    
    public final long getItemId(int paramInt)
    {
      GMTrace.i(7893613019136L, 58812);
      long l = paramInt;
      GMTrace.o(7893613019136L, 58812);
      return l;
    }
    
    public final int getItemViewType(int paramInt)
    {
      GMTrace.i(7893881454592L, 58814);
      if (this.oex)
      {
        if (paramInt == 0)
        {
          GMTrace.o(7893881454592L, 58814);
          return 2;
        }
        if (paramInt <= this.oew.size())
        {
          GMTrace.o(7893881454592L, 58814);
          return 0;
        }
        GMTrace.o(7893881454592L, 58814);
        return 3;
      }
      if (paramInt < this.oew.size())
      {
        GMTrace.o(7893881454592L, 58814);
        return 0;
      }
      GMTrace.o(7893881454592L, 58814);
      return 1;
    }
    
    public final View getView(int paramInt, View paramView, ViewGroup paramViewGroup)
    {
      GMTrace.i(7893747236864L, 58813);
      switch (getItemViewType(paramInt))
      {
      }
      for (;;)
      {
        GMTrace.o(7893747236864L, 58813);
        return paramView;
        MallEditText.c localc;
        com.tencent.mm.plugin.recharge.model.a locala;
        int i;
        label244:
        int j;
        if (paramView == null)
        {
          paramViewGroup = View.inflate(MallEditText.this.getContext(), a.g.sOo, null);
          localc = new MallEditText.c(MallEditText.this);
          localc.oeE = ((TextView)paramViewGroup.findViewById(a.f.sAY));
          localc.hvQ = ((TextView)paramViewGroup.findViewById(a.f.sAX));
          paramViewGroup.setTag(localc);
          locala = td(paramInt);
          paramView = paramViewGroup;
          if (locala == null) {
            continue;
          }
          paramView = paramViewGroup;
          if (localc == null) {
            continue;
          }
          paramView = paramViewGroup;
          if (localc.oeE == null) {
            continue;
          }
          paramView = paramViewGroup;
          if (localc.hvQ == null) {
            continue;
          }
          paramView = b.Fq(locala.odE);
          w.d("MicroMsg.MallEditText", "record.record " + paramView + ", record.name " + locala.name);
          if (com.tencent.mm.plugin.recharge.model.a.odC.equals(locala.odG)) {
            break label410;
          }
          paramView = new SpannableStringBuilder(paramView);
          int[] arrayOfInt = locala.odG;
          int k = arrayOfInt.length;
          i = 0;
          if (i >= k) {
            break label334;
          }
          j = arrayOfInt[i];
          if (j >= 0)
          {
            if (j < 7) {
              break label317;
            }
            paramInt = j + 2;
          }
        }
        for (;;)
        {
          paramView.setSpan(new ForegroundColorSpan(-65536), paramInt, paramInt + 1, 34);
          i += 1;
          break label244;
          localc = (MallEditText.c)paramView.getTag();
          paramViewGroup = paramView;
          break;
          label317:
          paramInt = j;
          if (j >= 3) {
            paramInt = j + 1;
          }
        }
        label334:
        localc.oeE.setText(paramView);
        label343:
        if ((locala.name != null) && (!bg.nm(locala.name.trim()))) {
          localc.hvQ.setText(MallEditText.this.getResources().getString(a.i.sWo, new Object[] { locala.name }));
        }
        for (;;)
        {
          paramViewGroup.setBackgroundResource(a.e.aVO);
          paramView = paramViewGroup;
          break;
          label410:
          localc.oeE.setText(paramView);
          break label343;
          localc.hvQ.setText("");
        }
        paramView = View.inflate(MallEditText.this.getContext(), a.g.sOn, null);
        paramView.setOnClickListener(new View.OnClickListener()
        {
          public final void onClick(View paramAnonymousView)
          {
            GMTrace.i(7886231044096L, 58757);
            MallEditText.a(MallEditText.this).dismissDropDown();
            GMTrace.o(7886231044096L, 58757);
          }
        });
        continue;
        paramView = View.inflate(MallEditText.this.getContext(), a.g.sOp, null);
        paramView.setOnClickListener(new View.OnClickListener()
        {
          public final void onClick(View paramAnonymousView)
          {
            GMTrace.i(7878983286784L, 58703);
            com.tencent.mm.plugin.recharge.a.a.baj().bi(null);
            MallEditText.this.b(null);
            MallEditText.d(MallEditText.this).bi(new LinkedList());
            MallEditText.d(MallEditText.this).notifyDataSetChanged();
            GMTrace.o(7878983286784L, 58703);
          }
        });
        continue;
        paramView = View.inflate(MallEditText.this.getContext(), a.g.sOp, null);
        ((TextView)paramView).setText(a.i.sWf);
        paramView.setOnClickListener(new View.OnClickListener()
        {
          public final void onClick(View paramAnonymousView)
          {
            GMTrace.i(7883278254080L, 58735);
            MallEditText.a(MallEditText.this).dismissDropDown();
            GMTrace.o(7883278254080L, 58735);
          }
        });
      }
    }
    
    public final int getViewTypeCount()
    {
      GMTrace.i(7894015672320L, 58815);
      GMTrace.o(7894015672320L, 58815);
      return 4;
    }
    
    public final com.tencent.mm.plugin.recharge.model.a td(int paramInt)
    {
      com.tencent.mm.plugin.recharge.model.a locala1 = null;
      for (;;)
      {
        try
        {
          GMTrace.i(7893478801408L, 58811);
          if (!this.oex) {
            break label95;
          }
          if (paramInt == 0)
          {
            GMTrace.o(7893478801408L, 58811);
            return locala1;
          }
          if (paramInt <= this.oew.size())
          {
            locala1 = (com.tencent.mm.plugin.recharge.model.a)this.oew.get(paramInt - 1);
            GMTrace.o(7893478801408L, 58811);
            continue;
          }
          GMTrace.o(7893478801408L, 58811);
        }
        finally {}
        continue;
        label95:
        if (paramInt < this.oew.size())
        {
          com.tencent.mm.plugin.recharge.model.a locala2 = (com.tencent.mm.plugin.recharge.model.a)this.oew.get(paramInt);
          GMTrace.o(7893478801408L, 58811);
        }
        else
        {
          GMTrace.o(7893478801408L, 58811);
        }
      }
    }
    
    private final class a
      extends Filter
    {
      private a()
      {
        GMTrace.i(7877909544960L, 58695);
        GMTrace.o(7877909544960L, 58695);
      }
      
      private static int[] jdMethod_do(String paramString1, String paramString2)
      {
        GMTrace.i(7878312198144L, 58698);
        if (paramString1.equals(paramString2))
        {
          paramString1 = com.tencent.mm.plugin.recharge.model.a.odC;
          GMTrace.o(7878312198144L, 58698);
          return paramString1;
        }
        if ((paramString2 != null) && (paramString1.length() == paramString2.length()))
        {
          int[] arrayOfInt = new int[2];
          int[] tmp52_50 = arrayOfInt;
          tmp52_50[0] = -1;
          int[] tmp56_52 = tmp52_50;
          tmp56_52[1] = -1;
          tmp56_52;
          int j = paramString1.length();
          int i = 0;
          j -= 1;
          int k;
          for (;;)
          {
            k = i;
            if (j <= 0) {
              break;
            }
            k = i;
            if (paramString2.charAt(j) != paramString1.charAt(j))
            {
              i += 1;
              k = i;
              if (i > 2) {
                break;
              }
              arrayOfInt[(i - 1)] = j;
              k = i;
            }
            j -= 1;
            i = k;
          }
          if (k <= 2)
          {
            GMTrace.o(7878312198144L, 58698);
            return arrayOfInt;
          }
        }
        paramString1 = com.tencent.mm.plugin.recharge.model.a.odD;
        GMTrace.o(7878312198144L, 58698);
        return paramString1;
      }
      
      protected final Filter.FilterResults performFiltering(final CharSequence paramCharSequence)
      {
        Filter.FilterResults localFilterResults;
        ArrayList localArrayList;
        Object localObject1;
        try
        {
          GMTrace.i(7878043762688L, 58696);
          localFilterResults = new Filter.FilterResults();
          localArrayList = new ArrayList();
          if (paramCharSequence != null) {}
          for (localObject1 = b.Fp(paramCharSequence.toString()); ((String)localObject1).equals(MallEditText.a.a(MallEditText.a.this)); localObject1 = "")
          {
            MallEditText.a(MallEditText.this).post(new Runnable()
            {
              public final void run()
              {
                GMTrace.i(7888378527744L, 58773);
                MallEditText.a(MallEditText.this).dismissDropDown();
                GMTrace.o(7888378527744L, 58773);
              }
            });
            GMTrace.o(7878043762688L, 58696);
            return localFilterResults;
          }
          MallEditText.a.a(MallEditText.a.this, (String)localObject1);
          if (MallEditText.this.QW()) {
            break label378;
          }
          if (bg.nm(MallEditText.a.a(MallEditText.a.this))) {
            break label358;
          }
          w.d("MicroMsg.MallEditText", "performFiltering " + paramCharSequence);
          paramCharSequence = MallEditText.a.b(MallEditText.a.this).iterator();
          while (paramCharSequence.hasNext())
          {
            localObject1 = (com.tencent.mm.plugin.recharge.model.a)paramCharSequence.next();
            if (((com.tencent.mm.plugin.recharge.model.a)localObject1).odE.startsWith(MallEditText.a.a(MallEditText.a.this))) {
              localArrayList.add(localObject1);
            }
          }
          bool = false;
        }
        finally {}
        boolean bool;
        label228:
        if (localArrayList.size() == 0)
        {
          MallEditText.a(MallEditText.this).post(new Runnable()
          {
            public final void run()
            {
              GMTrace.i(7880057028608L, 58711);
              MallEditText.a(MallEditText.this).dismissDropDown();
              GMTrace.o(7880057028608L, 58711);
            }
          });
          bool = false;
        }
        for (;;)
        {
          paramCharSequence = MallEditText.a.this.oew;
          MallEditText.a.this.oew = localArrayList;
          MallEditText.a.this.oex = bool;
          localFilterResults.count = MallEditText.a.this.oew.size();
          localFilterResults.values = MallEditText.a.this.oew;
          w.d("MicroMsg.MallEditText", "results.count " + localFilterResults.count);
          paramCharSequence.clear();
          GMTrace.o(7878043762688L, 58696);
          break;
          label358:
          localArrayList.addAll(MallEditText.a.b(MallEditText.a.this));
          bool = false;
          break label228;
          label378:
          long l = System.currentTimeMillis();
          w.d("MicroMsg.MallEditText", "performFiltering " + paramCharSequence);
          paramCharSequence = MallEditText.a.b(MallEditText.a.this).iterator();
          while (paramCharSequence.hasNext())
          {
            localObject1 = (com.tencent.mm.plugin.recharge.model.a)paramCharSequence.next();
            if (((com.tencent.mm.plugin.recharge.model.a)localObject1).odE.equals(MallEditText.a.a(MallEditText.a.this)))
            {
              ((com.tencent.mm.plugin.recharge.model.a)localObject1).odG = com.tencent.mm.plugin.recharge.model.a.odC;
              localArrayList.clear();
              localArrayList.add(localObject1);
            }
          }
          if (localArrayList.size() <= 0)
          {
            paramCharSequence = MallEditText.f(MallEditText.this);
            if (paramCharSequence != null) {}
          }
          try
          {
            MallEditText.a(MallEditText.this, com.tencent.mm.pluginsdk.a.dC(MallEditText.this.getContext()));
            if (MallEditText.f(MallEditText.this) != null)
            {
              paramCharSequence = MallEditText.f(MallEditText.this).iterator();
              if (paramCharSequence.hasNext())
              {
                localObject2 = (String[])paramCharSequence.next();
                str = b.Fp(localObject2[2]);
                localObject1 = jdMethod_do(MallEditText.a.a(MallEditText.a.this), str);
                if (!com.tencent.mm.plugin.recharge.model.a.odC.equals(localObject1)) {
                  break label703;
                }
                paramCharSequence = new com.tencent.mm.plugin.recharge.model.a(str, localObject2[1], 1);
                paramCharSequence.odG = com.tencent.mm.plugin.recharge.model.a.odC;
                localArrayList.clear();
                localArrayList.add(paramCharSequence);
              }
            }
            w.d("MicroMsg.MallEditText", " search phone number cost " + (System.currentTimeMillis() - l) + " ms ");
            bool = true;
          }
          catch (Exception paramCharSequence)
          {
            for (;;)
            {
              Object localObject2;
              String str;
              w.printErrStackTrace("MicroMsg.MallEditText", paramCharSequence, "", new Object[0]);
              continue;
              label703:
              if ((!com.tencent.mm.plugin.recharge.model.a.odD.equals(localObject1)) && (localArrayList.size() < 5))
              {
                localObject2 = new com.tencent.mm.plugin.recharge.model.a(str, localObject2[1], 1);
                ((com.tencent.mm.plugin.recharge.model.a)localObject2).odG = ((int[])localObject1);
                localArrayList.add(localObject2);
              }
            }
          }
          if ((localArrayList.size() == 1) && (MallEditText.this.QW()))
          {
            paramCharSequence = (com.tencent.mm.plugin.recharge.model.a)localArrayList.get(0);
            if (com.tencent.mm.plugin.recharge.model.a.odC.equals(paramCharSequence.odG))
            {
              MallEditText.a(MallEditText.this).post(new Runnable()
              {
                public final void run()
                {
                  GMTrace.i(7888781180928L, 58776);
                  MallEditText.a(MallEditText.this, paramCharSequence);
                  if (!bg.nm(MallEditText.e(MallEditText.this).name))
                  {
                    MallEditText.g(MallEditText.this).setText(MallEditText.e(MallEditText.this).name);
                    MallEditText.g(MallEditText.this).setVisibility(0);
                  }
                  for (;;)
                  {
                    MallEditText.a(MallEditText.this).dismissDropDown();
                    GMTrace.o(7888781180928L, 58776);
                    return;
                    MallEditText.g(MallEditText.this).setText("");
                    MallEditText.g(MallEditText.this).setVisibility(8);
                  }
                }
              });
              bool = false;
            }
          }
        }
      }
      
      protected final void publishResults(CharSequence paramCharSequence, Filter.FilterResults paramFilterResults)
      {
        GMTrace.i(7878177980416L, 58697);
        GMTrace.o(7878177980416L, 58697);
      }
    }
  }
  
  public static abstract interface b
  {
    public abstract void bap();
    
    public abstract void gR(boolean paramBoolean);
  }
  
  private final class c
  {
    TextView hvQ;
    TextView oeE;
    
    public c()
    {
      GMTrace.i(7901129211904L, 58868);
      GMTrace.o(7901129211904L, 58868);
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\recharge\ui\MallEditText.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */