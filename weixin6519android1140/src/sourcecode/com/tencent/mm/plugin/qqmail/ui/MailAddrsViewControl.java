package com.tencent.mm.plugin.qqmail.ui;

import android.content.Context;
import android.content.Intent;
import android.text.Editable;
import android.text.TextWatcher;
import android.util.AttributeSet;
import android.view.GestureDetector;
import android.view.GestureDetector.SimpleOnGestureListener;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.View.OnClickListener;
import android.view.View.OnFocusChangeListener;
import android.view.View.OnKeyListener;
import android.view.View.OnTouchListener;
import android.view.ViewGroup;
import android.view.inputmethod.InputMethodManager;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.AutoCompleteTextView;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.Filter;
import android.widget.Filter.FilterResults;
import android.widget.Filterable;
import android.widget.RelativeLayout;
import android.widget.RelativeLayout.LayoutParams;
import android.widget.TextView;
import android.widget.TextView.OnEditorActionListener;
import android.widget.Toast;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.R.g;
import com.tencent.mm.R.h;
import com.tencent.mm.R.i;
import com.tencent.mm.R.l;
import com.tencent.mm.plugin.qqmail.b.i;
import com.tencent.mm.plugin.qqmail.b.j;
import com.tencent.mm.plugin.qqmail.b.p;
import com.tencent.mm.plugin.qqmail.stub.ReadMailProxy;
import com.tencent.mm.remoteservice.d;
import com.tencent.mm.sdk.platformtools.ae;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.y.q;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MailAddrsViewControl
  extends RelativeLayout
{
  private static final Pattern nWT;
  private ae handler;
  private boolean hvp;
  private GestureDetector nVV;
  LinkedList<i> nWN;
  AutoCompleteTextView nWO;
  private b nWP;
  c nWQ;
  private View nWR;
  a nWS;
  private GestureDetector.SimpleOnGestureListener nWU;
  
  static
  {
    GMTrace.i(5541178900480L, 41285);
    nWT = Pattern.compile("[a-zA-Z0-9\\+\\.\\_\\%\\-\\+]{1,256}\\@[a-zA-Z0-9][a-zA-Z0-9\\-]{0,64}(\\.[a-zA-Z0-9][a-zA-Z0-9\\-]{0,25})+");
    GMTrace.o(5541178900480L, 41285);
  }
  
  public MailAddrsViewControl(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    GMTrace.i(5538226110464L, 41263);
    this.hvp = false;
    this.nWN = new LinkedList();
    this.handler = new ae();
    this.nWS = null;
    this.nWU = new GestureDetector.SimpleOnGestureListener()
    {
      private void aZo()
      {
        GMTrace.i(5566546051072L, 41474);
        i locali = (i)MailAddrsViewControl.c(MailAddrsViewControl.this).getTag();
        if (MailAddrsViewControl.g(MailAddrsViewControl.this) != null)
        {
          MailAddrsViewControl.g(MailAddrsViewControl.this);
          MailAddrsViewControl.c(MailAddrsViewControl.this);
        }
        Intent localIntent = new Intent(MailAddrsViewControl.this.getContext(), MailAddrProfileUI.class);
        localIntent.putExtra("name", locali.name);
        localIntent.putExtra("addr", locali.mwD);
        if (!MailAddrsViewControl.h(MailAddrsViewControl.this)) {}
        for (boolean bool = true;; bool = false)
        {
          localIntent.putExtra("can_compose", bool);
          MailAddrsViewControl.this.getContext().startActivity(localIntent);
          GMTrace.o(5566546051072L, 41474);
          return;
        }
      }
      
      public final boolean onDoubleTap(MotionEvent paramAnonymousMotionEvent)
      {
        GMTrace.i(5566948704256L, 41477);
        aZo();
        GMTrace.o(5566948704256L, 41477);
        return true;
      }
      
      public final void onLongPress(MotionEvent paramAnonymousMotionEvent)
      {
        GMTrace.i(5566814486528L, 41476);
        if ((MailAddrsViewControl.g(MailAddrsViewControl.this) != null) && (MailAddrsViewControl.c(MailAddrsViewControl.this) != null))
        {
          MailAddrsViewControl.g(MailAddrsViewControl.this);
          MailAddrsViewControl.c(MailAddrsViewControl.this);
          MailAddrsViewControl.c(MailAddrsViewControl.this).getTag();
        }
        GMTrace.o(5566814486528L, 41476);
      }
      
      public final boolean onSingleTapUp(MotionEvent paramAnonymousMotionEvent)
      {
        GMTrace.i(5566680268800L, 41475);
        if (!MailAddrsViewControl.h(MailAddrsViewControl.this)) {
          aZo();
        }
        GMTrace.o(5566680268800L, 41475);
        return true;
      }
    };
    this.nVV = new GestureDetector(paramContext, this.nWU);
    GMTrace.o(5538226110464L, 41263);
  }
  
  private static boolean Fg(String paramString)
  {
    GMTrace.i(5539568287744L, 41273);
    boolean bool = nWT.matcher(paramString).matches();
    GMTrace.o(5539568287744L, 41273);
    return bool;
  }
  
  private void am(String paramString, boolean paramBoolean)
  {
    GMTrace.i(5539970940928L, 41276);
    paramString = paramString.trim();
    if (paramString.length() == 0)
    {
      GMTrace.o(5539970940928L, 41276);
      return;
    }
    Object localObject = com.tencent.mm.plugin.qqmail.b.w.aYE().nSQ.EW(paramString);
    if (((List)localObject).size() > 0)
    {
      e((i)((List)localObject).get(0));
      this.nWO.setText("");
      GMTrace.o(5539970940928L, 41276);
      return;
    }
    if (Fg(paramString))
    {
      localObject = new i();
      ((i)localObject).name = paramString;
      ((i)localObject).mwD = paramString;
      ((i)localObject).nSt = 0;
      e((i)localObject);
      this.nWO.setText("");
      GMTrace.o(5539970940928L, 41276);
      return;
    }
    if (paramBoolean)
    {
      if (this.nWS != null) {
        this.nWS.aYV();
      }
      for (;;)
      {
        this.nWO.setText(paramString);
        this.nWO.setSelection(paramString.length());
        GMTrace.o(5539970940928L, 41276);
        return;
        Toast.makeText(getContext(), R.l.dOi, 2000).show();
      }
    }
    if (this.nWS != null) {
      this.nWS.b(this);
    }
    GMTrace.o(5539970940928L, 41276);
  }
  
  public final void a(b paramb)
  {
    GMTrace.i(5538494545920L, 41265);
    if (this.nWO != null)
    {
      this.nWP = paramb;
      this.nWO.setAdapter(paramb);
    }
    GMTrace.o(5538494545920L, 41265);
  }
  
  public final void a(String[] paramArrayOfString, boolean paramBoolean)
  {
    GMTrace.i(5539165634560L, 41270);
    if (paramBoolean)
    {
      removeAllViews();
      this.nWN.clear();
      aZn();
      invalidate();
    }
    if ((paramArrayOfString == null) || (paramArrayOfString.length == 0))
    {
      GMTrace.o(5539165634560L, 41270);
      return;
    }
    int j = paramArrayOfString.length;
    int i = 0;
    while (i < j)
    {
      i locali = j.EX(paramArrayOfString[i]);
      if (locali != null) {
        e(locali);
      }
      i += 1;
    }
    GMTrace.o(5539165634560L, 41270);
  }
  
  public final String[] a(boolean paramBoolean, d paramd)
  {
    int i = 0;
    GMTrace.i(5538628763648L, 41266);
    if ((paramd != null) && (paramd.isConnected())) {}
    String[] arrayOfString;
    for (;;)
    {
      try
      {
        paramd = (String)new ReadMailProxy(paramd, null).REMOTE_CALL("getUserBindEmail", new Object[0]);
        arrayOfString = new String[this.nWN.size()];
        if (i >= this.nWN.size()) {
          break;
        }
        i locali = (i)this.nWN.get(i);
        if ((paramBoolean) && (locali.mwD.equalsIgnoreCase(paramd))) {
          break label179;
        }
        arrayOfString[i] = (locali.name + " " + locali.mwD);
        i += 1;
        continue;
        paramd = q.getUserBindEmail();
      }
      catch (Exception paramd)
      {
        com.tencent.mm.sdk.platformtools.w.e("MicroMsg.QQMail.MailAddrsViewControl", "getMailAddrStringArray, getUserBindEmail fail, ex = %s", new Object[] { paramd.getMessage() });
        GMTrace.o(5538628763648L, 41266);
        return null;
      }
      continue;
      label179:
      arrayOfString[i] = "";
    }
    GMTrace.o(5538628763648L, 41266);
    return arrayOfString;
  }
  
  public final boolean aZi()
  {
    GMTrace.i(5538091892736L, 41262);
    Editable localEditable = this.nWO.getText();
    if (localEditable != null)
    {
      if (localEditable.toString().length() <= 0)
      {
        GMTrace.o(5538091892736L, 41262);
        return true;
      }
      GMTrace.o(5538091892736L, 41262);
      return false;
    }
    GMTrace.o(5538091892736L, 41262);
    return true;
  }
  
  public final void aZj()
  {
    GMTrace.i(5538360328192L, 41264);
    this.hvp = true;
    int i;
    if (this.nWO == null) {
      i = 0;
    }
    for (;;)
    {
      Object localObject;
      if (i < getChildCount())
      {
        localObject = getChildAt(i);
        if (!(localObject instanceof AutoCompleteTextView)) {
          break label166;
        }
        this.nWO = ((AutoCompleteTextView)localObject);
      }
      label166:
      do
      {
        if (this.nWO != null)
        {
          this.nWO.setDropDownBackgroundResource(R.g.aZh);
          setOnClickListener(new View.OnClickListener()
          {
            public final void onClick(View paramAnonymousView)
            {
              GMTrace.i(5534065360896L, 41232);
              MailAddrsViewControl.this.nWO.requestFocus();
              ((InputMethodManager)MailAddrsViewControl.this.getContext().getSystemService("input_method")).toggleSoftInput(0, 1);
              GMTrace.o(5534065360896L, 41232);
            }
          });
          this.nWO.setOnItemClickListener(new AdapterView.OnItemClickListener()
          {
            public final void onItemClick(AdapterView<?> paramAnonymousAdapterView, View paramAnonymousView, int paramAnonymousInt, long paramAnonymousLong)
            {
              GMTrace.i(5485075890176L, 40867);
              paramAnonymousAdapterView = MailAddrsViewControl.e(MailAddrsViewControl.this).sV(paramAnonymousInt);
              MailAddrsViewControl.this.e(paramAnonymousAdapterView);
              MailAddrsViewControl.this.nWO.setText("");
              GMTrace.o(5485075890176L, 40867);
            }
          });
          this.nWO.setOnEditorActionListener(new TextView.OnEditorActionListener()
          {
            public final boolean onEditorAction(TextView paramAnonymousTextView, int paramAnonymousInt, KeyEvent paramAnonymousKeyEvent)
            {
              GMTrace.i(5563324825600L, 41450);
              if (paramAnonymousInt == 5)
              {
                paramAnonymousTextView = MailAddrsViewControl.this.nWO.getEditableText().toString();
                if ((paramAnonymousTextView != null) && (paramAnonymousTextView.length() > 0))
                {
                  MailAddrsViewControl.a(MailAddrsViewControl.this, paramAnonymousTextView, false);
                  MailAddrsViewControl.this.aZn();
                }
              }
              GMTrace.o(5563324825600L, 41450);
              return true;
            }
          });
          this.nWO.setOnKeyListener(new View.OnKeyListener()
          {
            public final boolean onKey(View paramAnonymousView, int paramAnonymousInt, KeyEvent paramAnonymousKeyEvent)
            {
              GMTrace.i(5492726300672L, 40924);
              if ((paramAnonymousInt == 67) && (paramAnonymousKeyEvent.getAction() == 0))
              {
                paramAnonymousView = MailAddrsViewControl.this.nWO.getEditableText().toString();
                if ((paramAnonymousView.length() == 0) && (MailAddrsViewControl.c(MailAddrsViewControl.this) != null) && (MailAddrsViewControl.c(MailAddrsViewControl.this).isSelected()))
                {
                  MailAddrsViewControl.this.f((i)MailAddrsViewControl.c(MailAddrsViewControl.this).getTag());
                  MailAddrsViewControl.a(MailAddrsViewControl.this, null);
                  MailAddrsViewControl.this.aZn();
                }
              }
              for (;;)
              {
                GMTrace.o(5492726300672L, 40924);
                return false;
                if ((paramAnonymousView.length() == 0) && (MailAddrsViewControl.f(MailAddrsViewControl.this).size() > 0))
                {
                  paramAnonymousInt = MailAddrsViewControl.f(MailAddrsViewControl.this).size() - 1;
                  paramAnonymousView = MailAddrsViewControl.this.getChildAt(paramAnonymousInt);
                  if (!paramAnonymousView.isSelected())
                  {
                    paramAnonymousView.setSelected(true);
                  }
                  else
                  {
                    MailAddrsViewControl.this.f((i)MailAddrsViewControl.f(MailAddrsViewControl.this).get(paramAnonymousInt));
                    MailAddrsViewControl.this.aZn();
                    continue;
                    if ((paramAnonymousInt == 66) && (paramAnonymousKeyEvent.getAction() == 0))
                    {
                      paramAnonymousView = MailAddrsViewControl.this.nWO.getEditableText().toString();
                      if ((paramAnonymousView != null) && (paramAnonymousView.length() > 0))
                      {
                        MailAddrsViewControl.a(MailAddrsViewControl.this, paramAnonymousView, true);
                        MailAddrsViewControl.this.aZn();
                      }
                    }
                  }
                }
              }
            }
          });
          this.nWO.addTextChangedListener(new TextWatcher()
          {
            public final void afterTextChanged(Editable paramAnonymousEditable)
            {
              GMTrace.i(5497960792064L, 40963);
              GMTrace.o(5497960792064L, 40963);
            }
            
            public final void beforeTextChanged(CharSequence paramAnonymousCharSequence, int paramAnonymousInt1, int paramAnonymousInt2, int paramAnonymousInt3)
            {
              GMTrace.i(5497826574336L, 40962);
              GMTrace.o(5497826574336L, 40962);
            }
            
            public final void onTextChanged(CharSequence paramAnonymousCharSequence, int paramAnonymousInt1, int paramAnonymousInt2, int paramAnonymousInt3)
            {
              GMTrace.i(5497692356608L, 40961);
              paramAnonymousCharSequence = paramAnonymousCharSequence.toString();
              if ((paramAnonymousCharSequence.endsWith("\n")) || (paramAnonymousCharSequence.endsWith(" "))) {
                MailAddrsViewControl.a(MailAddrsViewControl.this, paramAnonymousCharSequence, true);
              }
              MailAddrsViewControl.this.aZn();
              GMTrace.o(5497692356608L, 40961);
            }
          });
          this.nWO.setOnFocusChangeListener(new View.OnFocusChangeListener()
          {
            public final void onFocusChange(View paramAnonymousView, boolean paramAnonymousBoolean)
            {
              GMTrace.i(5557016592384L, 41403);
              if (MailAddrsViewControl.g(MailAddrsViewControl.this) != null) {
                MailAddrsViewControl.g(MailAddrsViewControl.this).gH(paramAnonymousBoolean);
              }
              paramAnonymousView = MailAddrsViewControl.this.nWO.getEditableText().toString();
              if ((!paramAnonymousBoolean) && (paramAnonymousView.trim().length() > 0)) {
                MailAddrsViewControl.a(MailAddrsViewControl.this, paramAnonymousView, false);
              }
              if ((MailAddrsViewControl.c(MailAddrsViewControl.this) != null) && (MailAddrsViewControl.c(MailAddrsViewControl.this).isSelected()))
              {
                MailAddrsViewControl.c(MailAddrsViewControl.this).setSelected(paramAnonymousBoolean);
                MailAddrsViewControl.a(MailAddrsViewControl.this, null);
              }
              MailAddrsViewControl.this.aZn();
              GMTrace.o(5557016592384L, 41403);
            }
          });
        }
        GMTrace.o(5538360328192L, 41264);
        return;
        if ((localObject instanceof ViewGroup))
        {
          localObject = (ViewGroup)localObject;
          int j = 0;
          while (j < ((ViewGroup)localObject).getChildCount())
          {
            View localView = ((ViewGroup)localObject).getChildAt(j);
            if ((localView instanceof AutoCompleteTextView)) {
              this.nWO = ((AutoCompleteTextView)localView);
            }
            j += 1;
          }
        }
      } while (this.nWO != null);
      i += 1;
    }
  }
  
  public final boolean aZk()
  {
    GMTrace.i(5538762981376L, 41267);
    String str = this.nWO.getEditableText().toString().trim();
    if ((!bg.nm(str)) && (Fg(str)))
    {
      GMTrace.o(5538762981376L, 41267);
      return true;
    }
    GMTrace.o(5538762981376L, 41267);
    return false;
  }
  
  public final String aZl()
  {
    GMTrace.i(5538897199104L, 41268);
    if (aZk()) {
      am(this.nWO.getEditableText().toString(), false);
    }
    String str1 = "";
    int i = 0;
    while (i < this.nWN.size())
    {
      i locali = (i)this.nWN.get(i);
      String str2 = str1;
      if (i != 0) {
        str2 = str1 + ",";
      }
      str1 = str2 + locali.mwD;
      i += 1;
    }
    GMTrace.o(5538897199104L, 41268);
    return str1;
  }
  
  public final boolean aZm()
  {
    GMTrace.i(5539702505472L, 41274);
    Iterator localIterator = this.nWN.iterator();
    while (localIterator.hasNext()) {
      if (!Fg(((i)localIterator.next()).mwD))
      {
        GMTrace.o(5539702505472L, 41274);
        return false;
      }
    }
    GMTrace.o(5539702505472L, 41274);
    return true;
  }
  
  final void aZn()
  {
    GMTrace.i(5539836723200L, 41275);
    int i2 = getChildCount();
    int i3 = getMeasuredWidth();
    int j = 0;
    int i = 0;
    int m = 0;
    View localView;
    int k;
    int i4;
    if (m < i2)
    {
      localView = getChildAt(m);
      if (localView.getVisibility() == 8)
      {
        k = i;
        n = j;
        if (!(localView instanceof AutoCompleteTextView)) {}
      }
      else
      {
        n = localView.getWidth();
        i4 = localView.getHeight();
        k = n;
        if (n == 0)
        {
          localView.measure(View.MeasureSpec.makeMeasureSpec(getWidth(), Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(getHeight(), Integer.MIN_VALUE));
          k = localView.getMeasuredWidth();
        }
        if ((this.nWO == null) || (m != i2 - 1) || (this.nWO.isFocused())) {
          break label242;
        }
      }
    }
    label242:
    for (int n = 0;; n = k)
    {
      k = i;
      int i1 = j;
      if (j + n > i3)
      {
        i1 = 0;
        k = i + i4;
      }
      RelativeLayout.LayoutParams localLayoutParams = (RelativeLayout.LayoutParams)localView.getLayoutParams();
      localLayoutParams.setMargins(i1, k, localLayoutParams.rightMargin, localLayoutParams.bottomMargin);
      localView.setLayoutParams(localLayoutParams);
      n = i1 + n;
      localView.setVisibility(0);
      m += 1;
      i = k;
      j = n;
      break;
      GMTrace.o(5539836723200L, 41275);
      return;
    }
  }
  
  public final void bh(List<i> paramList)
  {
    GMTrace.i(5539299852288L, 41271);
    if (paramList == null)
    {
      GMTrace.o(5539299852288L, 41271);
      return;
    }
    paramList = paramList.iterator();
    while (paramList.hasNext()) {
      e((i)paramList.next());
    }
    GMTrace.o(5539299852288L, 41271);
  }
  
  public final void e(i parami)
  {
    GMTrace.i(5539031416832L, 41269);
    if (parami == null)
    {
      GMTrace.o(5539031416832L, 41269);
      return;
    }
    final Object localObject1 = this.nWN.iterator();
    do
    {
      if (!((Iterator)localObject1).hasNext()) {
        break;
      }
    } while (!((i)((Iterator)localObject1).next()).mwD.equalsIgnoreCase(parami.mwD));
    for (int i = 1;; i = 0)
    {
      if (i == 0)
      {
        Object localObject2 = (ViewGroup)View.inflate(getContext(), R.i.cDX, null);
        localObject1 = (Button)((ViewGroup)localObject2).findViewById(R.h.bVu);
        ((ViewGroup)localObject2).removeView((View)((Button)localObject1).getParent());
        ((Button)localObject1).setText(parami.name);
        if (this.hvp) {
          ((Button)localObject1).setCompoundDrawables(null, null, null, null);
        }
        ((Button)localObject1).setTag(this.nWN.size());
        localObject2 = (View)((Button)localObject1).getParent();
        ((Button)localObject1).setTag(parami);
        ((View)localObject2).setVisibility(4);
        ((View)localObject2).setTag(parami);
        addView((View)localObject2, this.nWN.size());
        this.nWN.add(parami);
        this.handler.postDelayed(new Runnable()
        {
          public final void run()
          {
            GMTrace.i(5537689239552L, 41259);
            localObject1.invalidate();
            localObject1.setOnTouchListener(new View.OnTouchListener()
            {
              public final boolean onTouch(View paramAnonymous2View, MotionEvent paramAnonymous2MotionEvent)
              {
                GMTrace.i(5542655295488L, 41296);
                if ((MailAddrsViewControl.c(MailAddrsViewControl.this) != null) && (MailAddrsViewControl.c(MailAddrsViewControl.this) != paramAnonymous2View) && (MailAddrsViewControl.c(MailAddrsViewControl.this).isSelected()))
                {
                  MailAddrsViewControl.c(MailAddrsViewControl.this).setSelected(false);
                  MailAddrsViewControl.a(MailAddrsViewControl.this, null);
                }
                MailAddrsViewControl.a(MailAddrsViewControl.this, paramAnonymous2View);
                if ((MailAddrsViewControl.this.nWO != null) && (paramAnonymous2MotionEvent.getAction() == 0))
                {
                  paramAnonymous2View = MailAddrsViewControl.2.this.nWW;
                  if (MailAddrsViewControl.2.this.nWW.isSelected()) {
                    break label213;
                  }
                }
                label213:
                for (boolean bool = true;; bool = false)
                {
                  paramAnonymous2View.setSelected(bool);
                  MailAddrsViewControl.this.nWO.setVisibility(0);
                  MailAddrsViewControl.this.nWO.requestFocus();
                  ((InputMethodManager)MailAddrsViewControl.this.getContext().getSystemService("input_method")).toggleSoftInput(0, 1);
                  bool = MailAddrsViewControl.d(MailAddrsViewControl.this).onTouchEvent(paramAnonymous2MotionEvent);
                  GMTrace.o(5542655295488L, 41296);
                  return bool;
                }
              }
            });
            MailAddrsViewControl.this.aZn();
            MailAddrsViewControl.this.invalidate();
            GMTrace.o(5537689239552L, 41259);
          }
        }, 100L);
      }
      GMTrace.o(5539031416832L, 41269);
      return;
    }
  }
  
  public final void f(i parami)
  {
    GMTrace.i(5539434070016L, 41272);
    int i = 0;
    while (i < this.nWN.size())
    {
      i locali = (i)this.nWN.get(i);
      if (parami.mwD.equalsIgnoreCase(locali.mwD))
      {
        removeViewAt(i);
        this.nWN.remove(i);
        aZn();
        invalidate();
        GMTrace.o(5539434070016L, 41272);
        return;
      }
      i += 1;
    }
    GMTrace.o(5539434070016L, 41272);
  }
  
  public static abstract interface a
  {
    public abstract void aYV();
    
    public abstract void b(MailAddrsViewControl paramMailAddrsViewControl);
  }
  
  public static final class b
    extends BaseAdapter
    implements Filterable
  {
    private Context mContext;
    private final Object mLock;
    private List<i> nWY;
    private boolean nWZ;
    private ArrayList<i> nXa;
    private a nXb;
    
    public b(Context paramContext, List<i> paramList)
    {
      GMTrace.i(5498095009792L, 40964);
      this.mLock = new Object();
      this.nWZ = true;
      this.mContext = paramContext;
      this.nWY = paramList;
      GMTrace.o(5498095009792L, 40964);
    }
    
    public final int getCount()
    {
      GMTrace.i(5498363445248L, 40966);
      int i = this.nWY.size();
      GMTrace.o(5498363445248L, 40966);
      return i;
    }
    
    public final Filter getFilter()
    {
      GMTrace.i(5498900316160L, 40970);
      if (this.nXb == null) {
        this.nXb = new a((byte)0);
      }
      a locala = this.nXb;
      GMTrace.o(5498900316160L, 40970);
      return locala;
    }
    
    public final long getItemId(int paramInt)
    {
      GMTrace.i(5498631880704L, 40968);
      long l = paramInt;
      GMTrace.o(5498631880704L, 40968);
      return l;
    }
    
    public final View getView(int paramInt, View paramView, ViewGroup paramViewGroup)
    {
      GMTrace.i(5498766098432L, 40969);
      if (paramView == null)
      {
        paramView = View.inflate(this.mContext, R.i.cDZ, null);
        paramViewGroup = new b();
        paramViewGroup.jUm = ((TextView)paramView.findViewById(R.h.bUW));
        paramViewGroup.nWJ = ((TextView)paramView.findViewById(R.h.bUU));
        paramViewGroup.nXd = ((CheckBox)paramView.findViewById(R.h.bUX));
        paramView.setTag(paramViewGroup);
      }
      for (;;)
      {
        paramViewGroup = sV(paramInt);
        b localb = (b)paramView.getTag();
        localb.jUm.setText(paramViewGroup.name);
        localb.nWJ.setText(paramViewGroup.mwD);
        localb.nXd.setVisibility(8);
        paramView.setBackgroundColor(-789517);
        GMTrace.o(5498766098432L, 40969);
        return paramView;
        paramView = (ViewGroup)paramView;
      }
    }
    
    public final void notifyDataSetChanged()
    {
      GMTrace.i(5498229227520L, 40965);
      super.notifyDataSetChanged();
      this.nWZ = true;
      GMTrace.o(5498229227520L, 40965);
    }
    
    public final i sV(int paramInt)
    {
      GMTrace.i(5498497662976L, 40967);
      i locali = (i)this.nWY.get(paramInt);
      GMTrace.o(5498497662976L, 40967);
      return locali;
    }
    
    private final class a
      extends Filter
    {
      private a()
      {
        GMTrace.i(5545339650048L, 41316);
        GMTrace.o(5545339650048L, 41316);
      }
      
      protected final Filter.FilterResults performFiltering(CharSequence arg1)
      {
        GMTrace.i(5545473867776L, 41317);
        Filter.FilterResults localFilterResults = new Filter.FilterResults();
        if (MailAddrsViewControl.b.b(MailAddrsViewControl.b.this) == null) {}
        synchronized (MailAddrsViewControl.b.c(MailAddrsViewControl.b.this))
        {
          MailAddrsViewControl.b.a(MailAddrsViewControl.b.this, new ArrayList(MailAddrsViewControl.b.d(MailAddrsViewControl.b.this)));
          if (??? != null) {
            if (???.length() != 0) {
              break label146;
            }
          }
        }
        for (;;)
        {
          synchronized (MailAddrsViewControl.b.c(MailAddrsViewControl.b.this))
          {
            ??? = new ArrayList(MailAddrsViewControl.b.b(MailAddrsViewControl.b.this));
            localFilterResults.values = ???;
            localFilterResults.count = ((ArrayList)???).size();
            GMTrace.o(5545473867776L, 41317);
            return localFilterResults;
            ??? = finally;
            throw ???;
          }
          label146:
          ??? = ???.toString().toLowerCase();
          ??? = MailAddrsViewControl.b.b(MailAddrsViewControl.b.this);
          int j = ((ArrayList)???).size();
          ArrayList localArrayList = new ArrayList(j);
          int i = 0;
          while (i < j)
          {
            i locali = (i)((ArrayList)???).get(i);
            if ((locali.name.toLowerCase().contains(???)) || (locali.mwD.toLowerCase().contains(???))) {
              localArrayList.add(locali);
            }
            i += 1;
          }
          ((Filter.FilterResults)localObject1).values = localArrayList;
          ((Filter.FilterResults)localObject1).count = localArrayList.size();
        }
      }
      
      protected final void publishResults(CharSequence paramCharSequence, Filter.FilterResults paramFilterResults)
      {
        GMTrace.i(5545608085504L, 41318);
        MailAddrsViewControl.b.a(MailAddrsViewControl.b.this, (List)paramFilterResults.values);
        if (paramFilterResults.count > 0)
        {
          MailAddrsViewControl.b.this.notifyDataSetChanged();
          GMTrace.o(5545608085504L, 41318);
          return;
        }
        MailAddrsViewControl.b.a(MailAddrsViewControl.b.this, new ArrayList(MailAddrsViewControl.b.b(MailAddrsViewControl.b.this)));
        MailAddrsViewControl.b.this.notifyDataSetInvalidated();
        GMTrace.o(5545608085504L, 41318);
      }
    }
    
    private final class b
    {
      TextView jUm;
      TextView nWJ;
      CheckBox nXd;
      
      public b()
      {
        GMTrace.i(5551916318720L, 41365);
        GMTrace.o(5551916318720L, 41365);
      }
    }
  }
  
  public static abstract class c
  {
    public c()
    {
      GMTrace.i(5534468014080L, 41235);
      GMTrace.o(5534468014080L, 41235);
    }
    
    public void gH(boolean paramBoolean)
    {
      GMTrace.i(5534602231808L, 41236);
      GMTrace.o(5534602231808L, 41236);
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\qqmail\ui\MailAddrsViewControl.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */