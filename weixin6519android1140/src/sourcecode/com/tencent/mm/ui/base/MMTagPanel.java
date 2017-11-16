package com.tencent.mm.ui.base;

import android.content.Context;
import android.content.res.Resources;
import android.os.IBinder;
import android.text.Editable;
import android.text.InputFilter;
import android.text.Spanned;
import android.text.TextUtils;
import android.text.TextUtils.TruncateAt;
import android.text.TextWatcher;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.View.OnFocusChangeListener;
import android.view.View.OnKeyListener;
import android.view.View.OnTouchListener;
import android.view.inputmethod.InputMethodManager;
import android.widget.TextView;
import android.widget.TextView.OnEditorActionListener;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.br.a;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.ui.f.c.b;
import com.tencent.mm.ui.tools.h;
import com.tencent.mm.ui.widget.MMEditText;
import com.tencent.mm.v.a.d;
import com.tencent.mm.v.a.e;
import com.tencent.mm.v.a.f;
import com.tencent.mm.v.a.g;
import com.tencent.mm.v.a.h;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class MMTagPanel
  extends FlowLayout
{
  public boolean lNJ;
  private boolean lfp;
  public int lgi;
  public int lgj;
  public int mqy;
  public int mqz;
  public LinkedList<d> ulN;
  public boolean weZ;
  private boolean wfa;
  public boolean wfb;
  public boolean wfc;
  public boolean wfd;
  public int wfe;
  private int wff;
  public int wfg;
  private int wfh;
  private d wfi;
  private LinkedList<d> wfj;
  public a wfk;
  private int wfl;
  private View wfm;
  public MMEditText wfn;
  public boolean wfo;
  private View.OnClickListener wfp;
  
  public MMTagPanel(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    GMTrace.i(3309272301568L, 24656);
    this.lfp = false;
    this.weZ = true;
    this.wfa = false;
    this.wfb = true;
    this.wfc = false;
    this.wfd = false;
    this.wfe = a.f.gcM;
    this.wff = 0;
    this.lgj = a.f.baL;
    this.lgi = a.d.aOE;
    this.mqy = a.f.baK;
    this.mqz = a.d.aPp;
    this.wfg = a.f.gcN;
    this.wfh = a.d.white;
    this.wfi = null;
    this.ulN = new LinkedList();
    this.wfj = new LinkedList();
    this.wfo = false;
    this.wfp = new View.OnClickListener()
    {
      public final void onClick(final View paramAnonymousView)
      {
        GMTrace.i(3289273860096L, 24507);
        if (((Integer)paramAnonymousView.getTag()).intValue() == 0)
        {
          MMTagPanel.this.a((TextView)paramAnonymousView, true, false);
          if (MMTagPanel.e(MMTagPanel.this) != null)
          {
            paramAnonymousView.post(new Runnable()
            {
              public final void run()
              {
                GMTrace.i(3330076049408L, 24811);
                MMTagPanel.e(MMTagPanel.this).ww(((TextView)paramAnonymousView).getText().toString());
                GMTrace.o(3330076049408L, 24811);
              }
            });
            GMTrace.o(3289273860096L, 24507);
          }
        }
        else if ((!MMTagPanel.f(MMTagPanel.this)) || (MMTagPanel.c(MMTagPanel.this)))
        {
          MMTagPanel.this.a((TextView)paramAnonymousView, false, false);
          if (MMTagPanel.e(MMTagPanel.this) != null)
          {
            paramAnonymousView.post(new Runnable()
            {
              public final void run()
              {
                GMTrace.i(3352893063168L, 24981);
                MMTagPanel.e(MMTagPanel.this).wv(((TextView)paramAnonymousView).getText().toString());
                GMTrace.o(3352893063168L, 24981);
              }
            });
            GMTrace.o(3289273860096L, 24507);
          }
        }
        else if (MMTagPanel.d(MMTagPanel.this) == null)
        {
          MMTagPanel.a(MMTagPanel.this, MMTagPanel.a(MMTagPanel.this, ((TextView)paramAnonymousView).getText().toString()));
          if (MMTagPanel.d(MMTagPanel.this) != null)
          {
            MMTagPanel.this.a(MMTagPanel.d(MMTagPanel.this).wfC, false, true);
            GMTrace.o(3289273860096L, 24507);
          }
        }
        else if (MMTagPanel.d(MMTagPanel.this).wfC == paramAnonymousView)
        {
          MMTagPanel.a(MMTagPanel.this, null);
          MMTagPanel.this.a((TextView)paramAnonymousView, false, false);
          if (MMTagPanel.e(MMTagPanel.this) != null)
          {
            paramAnonymousView.post(new Runnable()
            {
              public final void run()
              {
                GMTrace.i(3241895002112L, 24154);
                MMTagPanel.e(MMTagPanel.this).wv(((TextView)paramAnonymousView).getText().toString());
                GMTrace.o(3241895002112L, 24154);
              }
            });
            GMTrace.o(3289273860096L, 24507);
          }
        }
        else
        {
          MMTagPanel.this.cat();
          MMTagPanel.a(MMTagPanel.this, MMTagPanel.a(MMTagPanel.this, ((TextView)paramAnonymousView).getText().toString()));
          MMTagPanel.this.a(MMTagPanel.d(MMTagPanel.this).wfC, false, true);
        }
        GMTrace.o(3289273860096L, 24507);
      }
    };
    this.lNJ = true;
    init();
    GMTrace.o(3309272301568L, 24656);
  }
  
  public MMTagPanel(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    GMTrace.i(3309138083840L, 24655);
    this.lfp = false;
    this.weZ = true;
    this.wfa = false;
    this.wfb = true;
    this.wfc = false;
    this.wfd = false;
    this.wfe = a.f.gcM;
    this.wff = 0;
    this.lgj = a.f.baL;
    this.lgi = a.d.aOE;
    this.mqy = a.f.baK;
    this.mqz = a.d.aPp;
    this.wfg = a.f.gcN;
    this.wfh = a.d.white;
    this.wfi = null;
    this.ulN = new LinkedList();
    this.wfj = new LinkedList();
    this.wfo = false;
    this.wfp = new View.OnClickListener()
    {
      public final void onClick(final View paramAnonymousView)
      {
        GMTrace.i(3289273860096L, 24507);
        if (((Integer)paramAnonymousView.getTag()).intValue() == 0)
        {
          MMTagPanel.this.a((TextView)paramAnonymousView, true, false);
          if (MMTagPanel.e(MMTagPanel.this) != null)
          {
            paramAnonymousView.post(new Runnable()
            {
              public final void run()
              {
                GMTrace.i(3330076049408L, 24811);
                MMTagPanel.e(MMTagPanel.this).ww(((TextView)paramAnonymousView).getText().toString());
                GMTrace.o(3330076049408L, 24811);
              }
            });
            GMTrace.o(3289273860096L, 24507);
          }
        }
        else if ((!MMTagPanel.f(MMTagPanel.this)) || (MMTagPanel.c(MMTagPanel.this)))
        {
          MMTagPanel.this.a((TextView)paramAnonymousView, false, false);
          if (MMTagPanel.e(MMTagPanel.this) != null)
          {
            paramAnonymousView.post(new Runnable()
            {
              public final void run()
              {
                GMTrace.i(3352893063168L, 24981);
                MMTagPanel.e(MMTagPanel.this).wv(((TextView)paramAnonymousView).getText().toString());
                GMTrace.o(3352893063168L, 24981);
              }
            });
            GMTrace.o(3289273860096L, 24507);
          }
        }
        else if (MMTagPanel.d(MMTagPanel.this) == null)
        {
          MMTagPanel.a(MMTagPanel.this, MMTagPanel.a(MMTagPanel.this, ((TextView)paramAnonymousView).getText().toString()));
          if (MMTagPanel.d(MMTagPanel.this) != null)
          {
            MMTagPanel.this.a(MMTagPanel.d(MMTagPanel.this).wfC, false, true);
            GMTrace.o(3289273860096L, 24507);
          }
        }
        else if (MMTagPanel.d(MMTagPanel.this).wfC == paramAnonymousView)
        {
          MMTagPanel.a(MMTagPanel.this, null);
          MMTagPanel.this.a((TextView)paramAnonymousView, false, false);
          if (MMTagPanel.e(MMTagPanel.this) != null)
          {
            paramAnonymousView.post(new Runnable()
            {
              public final void run()
              {
                GMTrace.i(3241895002112L, 24154);
                MMTagPanel.e(MMTagPanel.this).wv(((TextView)paramAnonymousView).getText().toString());
                GMTrace.o(3241895002112L, 24154);
              }
            });
            GMTrace.o(3289273860096L, 24507);
          }
        }
        else
        {
          MMTagPanel.this.cat();
          MMTagPanel.a(MMTagPanel.this, MMTagPanel.a(MMTagPanel.this, ((TextView)paramAnonymousView).getText().toString()));
          MMTagPanel.this.a(MMTagPanel.d(MMTagPanel.this).wfC, false, true);
        }
        GMTrace.o(3289273860096L, 24507);
      }
    };
    this.lNJ = true;
    init();
    GMTrace.o(3309138083840L, 24655);
  }
  
  private void init()
  {
    GMTrace.i(3309540737024L, 24658);
    this.wfl = getContext().getResources().getDimensionPixelSize(a.e.aQo);
    this.wfm = LayoutInflater.from(getContext()).inflate(a.h.gfL, null);
    this.wfn = ((MMEditText)this.wfm.findViewById(a.g.bvB));
    this.wfn.setOnKeyListener(new View.OnKeyListener()
    {
      public final boolean onKey(View paramAnonymousView, int paramAnonymousInt, KeyEvent paramAnonymousKeyEvent)
      {
        GMTrace.i(3175994097664L, 23663);
        if ((paramAnonymousKeyEvent.getAction() == 0) && (67 == paramAnonymousInt))
        {
          w.d("MicroMsg.MMTagPanel", "on del click, selection[%d, %d]", new Object[] { Integer.valueOf(MMTagPanel.a(MMTagPanel.this).getSelectionStart()), Integer.valueOf(MMTagPanel.a(MMTagPanel.this).getSelectionEnd()) });
          if ((MMTagPanel.a(MMTagPanel.this).getSelectionStart() == 0) && (MMTagPanel.a(MMTagPanel.this).getSelectionStart() == MMTagPanel.a(MMTagPanel.this).getSelectionEnd())) {}
          for (paramAnonymousInt = 1; paramAnonymousInt == 0; paramAnonymousInt = 0)
          {
            GMTrace.o(3175994097664L, 23663);
            return false;
          }
          MMTagPanel.this.ayY();
          if ((MMTagPanel.b(MMTagPanel.this) == null) || (MMTagPanel.b(MMTagPanel.this).isEmpty()))
          {
            GMTrace.o(3175994097664L, 23663);
            return false;
          }
          if ((MMTagPanel.c(MMTagPanel.this)) || (MMTagPanel.d(MMTagPanel.this) != null)) {
            break label246;
          }
          MMTagPanel.a(MMTagPanel.this, (MMTagPanel.d)MMTagPanel.b(MMTagPanel.this).getLast());
          MMTagPanel.this.a(MMTagPanel.d(MMTagPanel.this).wfC, false, true);
          MMTagPanel.a(MMTagPanel.this).setCursorVisible(false);
        }
        for (;;)
        {
          GMTrace.o(3175994097664L, 23663);
          return false;
          label246:
          if ((MMTagPanel.d(MMTagPanel.this) != null) && (MMTagPanel.b(MMTagPanel.this) != null) && (MMTagPanel.b(MMTagPanel.this).getLast() != null) && (!bg.nm(MMTagPanel.d(MMTagPanel.this).wfB)) && (!bg.nm(((MMTagPanel.d)MMTagPanel.b(MMTagPanel.this).getLast()).wfB)) && (!MMTagPanel.d(MMTagPanel.this).wfB.equals(((MMTagPanel.d)MMTagPanel.b(MMTagPanel.this).getLast()).wfB)))
          {
            w.i("MicroMsg.MMTagPanel", "change hight");
            MMTagPanel.this.cat();
            MMTagPanel.a(MMTagPanel.this, (MMTagPanel.d)MMTagPanel.b(MMTagPanel.this).getLast());
            MMTagPanel.this.a(MMTagPanel.d(MMTagPanel.this).wfC, false, true);
            MMTagPanel.a(MMTagPanel.this).setCursorVisible(false);
          }
          else
          {
            paramAnonymousView = ((MMTagPanel.d)MMTagPanel.b(MMTagPanel.this).getLast()).wfB;
            MMTagPanel.this.removeTag(paramAnonymousView);
            if (MMTagPanel.e(MMTagPanel.this) != null) {
              MMTagPanel.e(MMTagPanel.this).wx(paramAnonymousView);
            }
            MMTagPanel.this.cat();
          }
        }
      }
    });
    this.wfn.addTextChangedListener(new TextWatcher()
    {
      public final void afterTextChanged(Editable paramAnonymousEditable)
      {
        GMTrace.i(3338934419456L, 24877);
        paramAnonymousEditable = paramAnonymousEditable.toString();
        if (MMTagPanel.e(MMTagPanel.this) != null) {
          MMTagPanel.e(MMTagPanel.this).wy(paramAnonymousEditable);
        }
        if (paramAnonymousEditable.length() > 0) {
          MMTagPanel.this.cat();
        }
        GMTrace.o(3338934419456L, 24877);
      }
      
      public final void beforeTextChanged(CharSequence paramAnonymousCharSequence, int paramAnonymousInt1, int paramAnonymousInt2, int paramAnonymousInt3)
      {
        GMTrace.i(3338800201728L, 24876);
        GMTrace.o(3338800201728L, 24876);
      }
      
      public final void onTextChanged(CharSequence paramAnonymousCharSequence, int paramAnonymousInt1, int paramAnonymousInt2, int paramAnonymousInt3)
      {
        GMTrace.i(3338665984000L, 24875);
        GMTrace.o(3338665984000L, 24875);
      }
    });
    this.wfn.setOnFocusChangeListener(new View.OnFocusChangeListener()
    {
      public final void onFocusChange(View paramAnonymousView, boolean paramAnonymousBoolean)
      {
        GMTrace.i(3200958595072L, 23849);
        w.d("MicroMsg.MMTagPanel", "on edittext focus changed %B", new Object[] { Boolean.valueOf(paramAnonymousBoolean) });
        if ((paramAnonymousBoolean) && (MMTagPanel.e(MMTagPanel.this) != null)) {
          MMTagPanel.e(MMTagPanel.this).atg();
        }
        GMTrace.o(3200958595072L, 23849);
      }
    });
    this.wfn.setOnClickListener(new View.OnClickListener()
    {
      public final void onClick(View paramAnonymousView)
      {
        GMTrace.i(3340410814464L, 24888);
        w.d("MicroMsg.MMTagPanel", "on edittext click");
        MMTagPanel.this.cat();
        if (MMTagPanel.e(MMTagPanel.this) != null) {
          MMTagPanel.e(MMTagPanel.this).atg();
        }
        GMTrace.o(3340410814464L, 24888);
      }
    });
    this.wfn.setOnEditorActionListener(new TextView.OnEditorActionListener()
    {
      public final boolean onEditorAction(TextView paramAnonymousTextView, int paramAnonymousInt, KeyEvent paramAnonymousKeyEvent)
      {
        GMTrace.i(3350879797248L, 24966);
        w.d("MicroMsg.MMTagPanel", "on action %d, %s", new Object[] { Integer.valueOf(paramAnonymousInt), paramAnonymousKeyEvent });
        GMTrace.o(3350879797248L, 24966);
        return false;
      }
    });
    final c localc = new c();
    b localb = new b();
    this.wfn.setFilters(new InputFilter[] { localc, localb });
    caq();
    setOnClickListener(new View.OnClickListener()
    {
      public final void onClick(View paramAnonymousView)
      {
        GMTrace.i(3201495465984L, 23853);
        w.d("MicroMsg.MMTagPanel", "on panel click, enableEditMode %B", new Object[] { Boolean.valueOf(MMTagPanel.f(MMTagPanel.this)) });
        if (MMTagPanel.f(MMTagPanel.this))
        {
          MMTagPanel.this.cat();
          MMTagPanel.a(MMTagPanel.this).requestFocus();
          MMTagPanel.a(MMTagPanel.this).setSelection(MMTagPanel.a(MMTagPanel.this).getText().length());
          ((InputMethodManager)MMTagPanel.this.getContext().getSystemService("input_method")).showSoftInput(MMTagPanel.a(MMTagPanel.this), 0);
          w.d("MicroMsg.MMTagPanel", "on content click");
          if (MMTagPanel.e(MMTagPanel.this) != null) {
            MMTagPanel.e(MMTagPanel.this).atg();
          }
        }
        GMTrace.o(3201495465984L, 23853);
      }
    });
    setOnTouchListener(new View.OnTouchListener()
    {
      public final boolean onTouch(View paramAnonymousView, MotionEvent paramAnonymousMotionEvent)
      {
        GMTrace.i(3153177083904L, 23493);
        if (MMTagPanel.g(MMTagPanel.this))
        {
          paramAnonymousMotionEvent = MMTagPanel.this.cam();
          if (!bg.nm(paramAnonymousMotionEvent))
          {
            paramAnonymousView = paramAnonymousMotionEvent;
            if (localc != null)
            {
              paramAnonymousView = paramAnonymousMotionEvent;
              if (h.WW(paramAnonymousMotionEvent) > localc.wfx)
              {
                int i = localc.wfx - h.WX(paramAnonymousMotionEvent);
                paramAnonymousView = paramAnonymousMotionEvent;
                if (i <= paramAnonymousMotionEvent.length()) {
                  paramAnonymousView = paramAnonymousMotionEvent.substring(0, i);
                }
              }
            }
            MMTagPanel.this.ba(paramAnonymousView, true);
            if (MMTagPanel.e(MMTagPanel.this) != null) {
              MMTagPanel.e(MMTagPanel.this).wz(paramAnonymousView);
            }
            MMTagPanel.this.can();
          }
        }
        GMTrace.o(3153177083904L, 23493);
        return false;
      }
    });
    GMTrace.o(3309540737024L, 24658);
  }
  
  public final void Cc(int paramInt)
  {
    GMTrace.i(3309674954752L, 24659);
    this.wff = paramInt;
    if (this.wfn != null)
    {
      a.fromDPToPix(getContext(), 6);
      getResources().getDimensionPixelSize(a.e.aQE);
      this.wfn.setBackgroundResource(this.wff);
    }
    GMTrace.o(3309674954752L, 24659);
  }
  
  public final void VE(String paramString)
  {
    GMTrace.i(3309809172480L, 24660);
    if (this.wfn != null) {
      this.wfn.setHint(paramString);
    }
    GMTrace.o(3309809172480L, 24660);
  }
  
  public final void a(TextView paramTextView, boolean paramBoolean1, boolean paramBoolean2)
  {
    GMTrace.i(3311688220672L, 24674);
    paramTextView.setTextSize(0, getContext().getResources().getDimension(a.e.aQo) * a.dZ(getContext()));
    if (paramBoolean2)
    {
      paramTextView.setBackgroundResource(this.wfg);
      paramTextView.setTextColor(getResources().getColor(this.wfh));
      paramTextView.setCompoundDrawablesWithIntrinsicBounds(0, 0, this.wfe, 0);
      GMTrace.o(3311688220672L, 24674);
      return;
    }
    if (paramBoolean1)
    {
      paramTextView.setTag(Integer.valueOf(1));
      paramTextView.setBackgroundResource(this.mqy);
      paramTextView.setTextColor(getResources().getColor(this.mqz));
      paramTextView.setCompoundDrawablesWithIntrinsicBounds(0, 0, 0, 0);
      GMTrace.o(3311688220672L, 24674);
      return;
    }
    paramTextView.setTag(Integer.valueOf(0));
    paramTextView.setBackgroundResource(this.lgj);
    paramTextView.setTextColor(getResources().getColor(this.lgi));
    paramTextView.setCompoundDrawablesWithIntrinsicBounds(0, 0, 0, 0);
    GMTrace.o(3311688220672L, 24674);
  }
  
  public final void a(d paramd)
  {
    GMTrace.i(3311285567488L, 24671);
    paramd.wfC.setOnClickListener(null);
    if (this.wfj.size() >= 16)
    {
      GMTrace.o(3311285567488L, 24671);
      return;
    }
    this.wfj.add(paramd);
    GMTrace.o(3311285567488L, 24671);
  }
  
  public final void a(d paramd, String paramString, boolean paramBoolean)
  {
    GMTrace.i(3311419785216L, 24672);
    paramd.wfB = paramString;
    paramd.wfC.setText(b.a(getContext(), paramString, this.wfl));
    TextView localTextView = paramd.wfC;
    if (this.weZ) {}
    for (paramString = this.wfp;; paramString = null)
    {
      localTextView.setOnClickListener(paramString);
      a(paramd.wfC, paramBoolean, false);
      GMTrace.o(3311419785216L, 24672);
      return;
    }
  }
  
  public final void a(Collection<String> paramCollection, List<String> paramList)
  {
    GMTrace.i(3311017132032L, 24669);
    caf();
    if (this.wfa) {
      addView(this.wfm);
    }
    if ((paramList == null) || (paramList.isEmpty()))
    {
      GMTrace.o(3311017132032L, 24669);
      return;
    }
    paramList = paramList.iterator();
    if (paramList.hasNext())
    {
      String str = (String)paramList.next();
      if (paramCollection == null) {}
      for (boolean bool = false;; bool = paramCollection.contains(str))
      {
        ba(str, bool);
        break;
      }
    }
    GMTrace.o(3311017132032L, 24669);
  }
  
  public void ayY()
  {
    GMTrace.i(3309406519296L, 24657);
    GMTrace.o(3309406519296L, 24657);
  }
  
  public final void ba(String paramString, boolean paramBoolean)
  {
    GMTrace.i(3311822438400L, 24675);
    if (bg.nm(paramString))
    {
      w.w("MicroMsg.MMTagPanel", "want to add tag, but it is null or empty");
      GMTrace.o(3311822438400L, 24675);
      return;
    }
    paramString = paramString.trim();
    w.d("MicroMsg.MMTagPanel", "want to add tag %s, do remove tag first", new Object[] { paramString });
    removeTag(paramString);
    Object localObject = this.ulN.iterator();
    while (((Iterator)localObject).hasNext()) {
      if (paramString.equals(((d)((Iterator)localObject).next()).wfB))
      {
        w.w("MicroMsg.MMTagPanel", "want to add tag %s, but it exsited!", new Object[] { paramString });
        GMTrace.o(3311822438400L, 24675);
        return;
      }
    }
    localObject = cas();
    a((d)localObject, paramString, paramBoolean);
    this.ulN.add(localObject);
    if (this.wfa) {
      addView(((d)localObject).wfC, getChildCount() - 1);
    }
    for (;;)
    {
      cat();
      GMTrace.o(3311822438400L, 24675);
      return;
      addView(((d)localObject).wfC);
    }
  }
  
  public final void bb(String paramString, boolean paramBoolean)
  {
    GMTrace.i(3312090873856L, 24677);
    if (bg.nm(paramString))
    {
      w.w("MicroMsg.MMTagPanel", "want to update tag status, but it is null or empty");
      GMTrace.o(3312090873856L, 24677);
      return;
    }
    Iterator localIterator = this.ulN.iterator();
    while (localIterator.hasNext())
    {
      d locald = (d)localIterator.next();
      if (paramString.equals(locald.wfB))
      {
        a(locald, paramString, paramBoolean);
        cat();
        GMTrace.o(3312090873856L, 24677);
        return;
      }
    }
    w.w("MicroMsg.MMTagPanel", "want to update tag %s status, but it not exsited!", new Object[] { paramString });
    GMTrace.o(3312090873856L, 24677);
  }
  
  public void caf()
  {
    GMTrace.i(3310882914304L, 24668);
    this.ulN.clear();
    removeAllViews();
    Iterator localIterator = this.ulN.iterator();
    while (localIterator.hasNext()) {
      a((d)localIterator.next());
    }
    GMTrace.o(3310882914304L, 24668);
  }
  
  public final String cam()
  {
    GMTrace.i(3309943390208L, 24661);
    if (this.wfn != null)
    {
      String str = this.wfn.getText().toString();
      GMTrace.o(3309943390208L, 24661);
      return str;
    }
    GMTrace.o(3309943390208L, 24661);
    return "";
  }
  
  public final void can()
  {
    GMTrace.i(3310077607936L, 24662);
    if (this.wfn != null) {
      this.wfn.setText("");
    }
    GMTrace.o(3310077607936L, 24662);
  }
  
  public final boolean cao()
  {
    GMTrace.i(3310211825664L, 24663);
    if (this.wfn == null)
    {
      GMTrace.o(3310211825664L, 24663);
      return false;
    }
    boolean bool = this.wfn.isFocused();
    GMTrace.o(3310211825664L, 24663);
    return bool;
  }
  
  public final void cap()
  {
    GMTrace.i(3310346043392L, 24664);
    if ((this.wfn == null) || (this.wfn.isFocused()))
    {
      GMTrace.o(3310346043392L, 24664);
      return;
    }
    this.wfn.requestFocus();
    GMTrace.o(3310346043392L, 24664);
  }
  
  public final void caq()
  {
    GMTrace.i(3310480261120L, 24665);
    if ((this.wfn != null) && (this.wfn.isFocused()))
    {
      w.d("MicroMsg.MMTagPanel", "do clear edit focus");
      InputMethodManager localInputMethodManager = (InputMethodManager)getContext().getSystemService("input_method");
      if (localInputMethodManager == null)
      {
        GMTrace.o(3310480261120L, 24665);
        return;
      }
      IBinder localIBinder = this.wfn.getWindowToken();
      if (localIBinder == null)
      {
        GMTrace.o(3310480261120L, 24665);
        return;
      }
      localInputMethodManager.hideSoftInputFromWindow(localIBinder, 0);
      this.wfn.clearFocus();
    }
    GMTrace.o(3310480261120L, 24665);
  }
  
  public final ArrayList<String> car()
  {
    GMTrace.i(3310748696576L, 24667);
    ArrayList localArrayList = new ArrayList();
    Iterator localIterator = this.ulN.iterator();
    while (localIterator.hasNext())
    {
      d locald = (d)localIterator.next();
      if (!bg.nm(locald.wfB)) {
        localArrayList.add(locald.wfB);
      }
    }
    GMTrace.o(3310748696576L, 24667);
    return localArrayList;
  }
  
  public final d cas()
  {
    GMTrace.i(3311151349760L, 24670);
    if (!this.wfj.isEmpty())
    {
      localObject = (d)this.wfj.removeFirst();
      GMTrace.o(3311151349760L, 24670);
      return (d)localObject;
    }
    d locald = new d();
    TextView localTextView = new TextView(getContext());
    localTextView.setBackgroundResource(this.lgj);
    localTextView.setTextColor(getResources().getColor(this.lgi));
    localTextView.setTag(Integer.valueOf(0));
    localTextView.setGravity(17);
    localTextView.setCompoundDrawablesWithIntrinsicBounds(0, 0, this.wfe, 0);
    if (this.weZ) {}
    for (Object localObject = this.wfp;; localObject = null)
    {
      localTextView.setOnClickListener((View.OnClickListener)localObject);
      localTextView.setEllipsize(TextUtils.TruncateAt.END);
      localTextView.setSingleLine();
      locald.wfC = localTextView;
      GMTrace.o(3311151349760L, 24670);
      return locald;
    }
  }
  
  public final void cat()
  {
    GMTrace.i(3311554002944L, 24673);
    if (this.wfn != null)
    {
      w.d("MicroMsg.MMTagPanel", "do clear high light info, edittext is focus %B", new Object[] { Boolean.valueOf(this.wfn.isFocused()) });
      this.wfn.setCursorVisible(true);
    }
    if (this.wfi == null)
    {
      GMTrace.o(3311554002944L, 24673);
      return;
    }
    TextView localTextView = this.wfi.wfC;
    if (((Integer)this.wfi.wfC.getTag()).intValue() == 1) {}
    for (boolean bool = true;; bool = false)
    {
      a(localTextView, bool, false);
      this.wfi = null;
      GMTrace.o(3311554002944L, 24673);
      return;
    }
  }
  
  public final void lJ(boolean paramBoolean)
  {
    GMTrace.i(3310614478848L, 24666);
    if (paramBoolean == this.wfa)
    {
      GMTrace.o(3310614478848L, 24666);
      return;
    }
    this.wfa = paramBoolean;
    removeView(this.wfm);
    if (this.wfa)
    {
      addView(this.wfm);
      caq();
    }
    GMTrace.o(3310614478848L, 24666);
  }
  
  public boolean onInterceptTouchEvent(MotionEvent paramMotionEvent)
  {
    GMTrace.i(3312225091584L, 24678);
    if (this.lNJ)
    {
      boolean bool = super.onInterceptTouchEvent(paramMotionEvent);
      GMTrace.o(3312225091584L, 24678);
      return bool;
    }
    GMTrace.o(3312225091584L, 24678);
    return true;
  }
  
  public final void removeTag(String paramString)
  {
    GMTrace.i(3311956656128L, 24676);
    if (bg.nm(paramString))
    {
      w.w("MicroMsg.MMTagPanel", "want to remove tag, but it is null or empty");
      GMTrace.o(3311956656128L, 24676);
      return;
    }
    Iterator localIterator = this.ulN.iterator();
    while (localIterator.hasNext())
    {
      d locald = (d)localIterator.next();
      if (paramString.equals(locald.wfB))
      {
        this.ulN.remove(locald);
        removeView(locald.wfC);
        a(locald);
        cat();
        GMTrace.o(3311956656128L, 24676);
        return;
      }
    }
    w.w("MicroMsg.MMTagPanel", "want to remove tag %s, but it not exsited!", new Object[] { paramString });
    GMTrace.o(3311956656128L, 24676);
  }
  
  public static abstract interface a
  {
    public abstract void atg();
    
    public abstract void j(boolean paramBoolean, int paramInt);
    
    public abstract void wv(String paramString);
    
    public abstract void ww(String paramString);
    
    public abstract void wx(String paramString);
    
    public abstract void wy(String paramString);
    
    public abstract void wz(String paramString);
  }
  
  public final class b
    implements InputFilter
  {
    int mark;
    List<String> wft;
    
    public b()
    {
      GMTrace.i(3268738547712L, 24354);
      this.wft = new LinkedList();
      GMTrace.o(3268738547712L, 24354);
    }
    
    public final CharSequence filter(final CharSequence paramCharSequence, int paramInt1, int paramInt2, Spanned paramSpanned, int paramInt3, int paramInt4)
    {
      GMTrace.i(3268872765440L, 24355);
      w.d("MicroMsg.MMTagPanel", "on create tag filter, %s [%d, %d) %s [%d, %d), maxlength[%B]", new Object[] { paramCharSequence, Integer.valueOf(paramInt1), Integer.valueOf(paramInt2), paramSpanned, Integer.valueOf(paramInt3), Integer.valueOf(paramInt4), Boolean.valueOf(MMTagPanel.i(MMTagPanel.this)) });
      this.mark = -1;
      this.wft.clear();
      Object localObject = new char[paramInt2 - paramInt1];
      TextUtils.getChars(paramCharSequence, paramInt1, paramInt2, (char[])localObject, 0);
      if (!MMTagPanel.j(MMTagPanel.this))
      {
        i = 0;
        paramCharSequence = new StringBuilder();
        if (paramInt1 < paramInt2)
        {
          if (localObject[paramInt1] == '\n') {
            i = 1;
          }
          for (;;)
          {
            paramInt1 += 1;
            break;
            paramCharSequence.append(localObject[paramInt1]);
          }
        }
        if (i != 0)
        {
          localObject = paramCharSequence.toString();
          paramCharSequence.insert(0, paramSpanned.subSequence(0, paramInt3));
          paramCharSequence.append(paramSpanned.subSequence(paramInt4, paramSpanned.length()));
          MMTagPanel.this.post(new Runnable()
          {
            public final void run()
            {
              GMTrace.i(3368462319616L, 25097);
              MMTagPanel.e(MMTagPanel.this).wz(paramCharSequence.toString());
              GMTrace.o(3368462319616L, 25097);
            }
          });
          GMTrace.o(3268872765440L, 24355);
          return (CharSequence)localObject;
        }
        GMTrace.o(3268872765440L, 24355);
        return null;
      }
      int i = paramInt1;
      if (i < paramInt2)
      {
        if ((localObject[i] == '\n') || (localObject[i] == ',') || (localObject[i] == ';') || (localObject[i] == '、') || (localObject[i] == 65292) || (localObject[i] == 65307))
        {
          if (-1 != this.mark) {
            break label397;
          }
          this.wft.add((paramSpanned.subSequence(0, paramInt3).toString() + paramCharSequence.subSequence(paramInt1, i)).trim());
        }
        for (;;)
        {
          this.mark = (i + 1);
          i += 1;
          break;
          label397:
          this.wft.add(paramCharSequence.subSequence(this.mark, i).toString().trim());
        }
      }
      if (MMTagPanel.h(MMTagPanel.this))
      {
        paramInt1 = h.WW(paramSpanned.toString());
        if ((MMTagPanel.i(MMTagPanel.this)) && (paramCharSequence.equals("\n")) && (36 < paramInt1)) {
          this.wft.clear();
        }
      }
      if (this.wft.isEmpty())
      {
        GMTrace.o(3268872765440L, 24355);
        return null;
      }
      if (MMTagPanel.e(MMTagPanel.this) != null)
      {
        localObject = this.wft.iterator();
        while (((Iterator)localObject).hasNext())
        {
          final String str = (String)((Iterator)localObject).next();
          if (str.length() > 0) {
            MMTagPanel.this.post(new Runnable()
            {
              public final void run()
              {
                GMTrace.i(3302024544256L, 24602);
                MMTagPanel.e(MMTagPanel.this).wz(str.trim());
                GMTrace.o(3302024544256L, 24602);
              }
            });
          }
        }
      }
      if (this.mark >= paramInt2) {
        paramSpanned.length();
      }
      for (paramCharSequence = paramSpanned.subSequence(paramInt4, paramSpanned.length()).toString();; paramCharSequence = paramCharSequence.subSequence(this.mark, paramInt2).toString() + paramSpanned.subSequence(paramInt4, paramSpanned.length()))
      {
        MMTagPanel.this.post(new Runnable()
        {
          public final void run()
          {
            GMTrace.i(3172101783552L, 23634);
            MMTagPanel.a(MMTagPanel.this).setText("");
            MMTagPanel.a(MMTagPanel.this).append(paramCharSequence);
            GMTrace.o(3172101783552L, 23634);
          }
        });
        GMTrace.o(3268872765440L, 24355);
        return "";
      }
    }
  }
  
  public final class c
    implements InputFilter
  {
    int wfx;
    private int wfy;
    public int wfz;
    
    public c()
    {
      GMTrace.i(3246324187136L, 24187);
      this.wfx = 36;
      this.wfy = 256;
      GMTrace.o(3246324187136L, 24187);
    }
    
    public final CharSequence filter(CharSequence paramCharSequence, int paramInt1, int paramInt2, Spanned paramSpanned, int paramInt3, int paramInt4)
    {
      GMTrace.i(3246458404864L, 24188);
      paramInt1 = h.WW(paramSpanned.toString()) + h.WW(paramCharSequence.toString());
      if (paramInt4 > paramInt3) {
        if (paramInt1 - (paramInt4 - paramInt3) > this.wfx)
        {
          MMTagPanel.a(MMTagPanel.this, true);
          this.wfz = (paramInt1 - (paramInt4 - paramInt3) - this.wfx);
        }
      }
      for (;;)
      {
        if ((MMTagPanel.h(MMTagPanel.this)) && (1 == this.wfz) && (paramCharSequence.equals("\n"))) {
          this.wfz = 0;
        }
        if (MMTagPanel.e(MMTagPanel.this) != null) {
          MMTagPanel.this.post(new Runnable()
          {
            public final void run()
            {
              GMTrace.i(3359067078656L, 25027);
              MMTagPanel.e(MMTagPanel.this).j(MMTagPanel.i(MMTagPanel.this), h.aO(MMTagPanel.c.this.wfz, ""));
              GMTrace.o(3359067078656L, 25027);
            }
          });
        }
        if (paramInt1 <= this.wfy) {
          break;
        }
        GMTrace.o(3246458404864L, 24188);
        return "";
        MMTagPanel.a(MMTagPanel.this, false);
        continue;
        if (paramInt1 > this.wfx)
        {
          MMTagPanel.a(MMTagPanel.this, true);
          this.wfz = (paramInt1 - this.wfx);
        }
        else
        {
          MMTagPanel.a(MMTagPanel.this, false);
        }
      }
      GMTrace.o(3246458404864L, 24188);
      return paramCharSequence;
    }
  }
  
  public static final class d
  {
    public String wfB;
    public TextView wfC;
    
    public d()
    {
      GMTrace.i(3367657013248L, 25091);
      GMTrace.o(3367657013248L, 25091);
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\ui\base\MMTagPanel.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */