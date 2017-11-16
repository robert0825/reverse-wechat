package com.tencent.mm.d;

import android.animation.PropertyValuesHolder;
import android.animation.ValueAnimator;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.PointF;
import android.graphics.Rect;
import android.os.Handler;
import android.os.Looper;
import android.text.SpannableString;
import android.view.MotionEvent;
import android.view.animation.LinearInterpolator;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.api.i;
import com.tencent.mm.b.c.1;
import com.tencent.mm.b.c.2;
import com.tencent.mm.bg.a.c;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.t.c.a;
import java.util.List;
import java.util.ListIterator;
import java.util.Stack;
import java.util.Timer;
import java.util.TimerTask;

public final class e
  extends b<com.tencent.mm.cache.c>
{
  private boolean evN;
  private boolean ewl;
  private TimerTask ewm;
  private Rect ewn;
  private float ewo;
  private float ewp;
  private int ewq;
  private int ewr;
  private boolean ews;
  private com.tencent.mm.b.c ewt;
  public com.tencent.mm.w.a ewu;
  boolean ewv;
  Matrix lD;
  private Timer mTimer;
  
  public e()
  {
    GMTrace.i(19666923683840L, 146530);
    this.mTimer = new Timer();
    this.ewn = new Rect();
    this.ewl = false;
    this.evN = false;
    this.ewo = 0.0F;
    this.ewp = 0.0F;
    this.ewq = 0;
    this.ewr = 0;
    this.ews = false;
    this.ewt = new com.tencent.mm.b.c(this);
    this.lD = new Matrix();
    this.ewv = false;
    GMTrace.o(19666923683840L, 146530);
  }
  
  private com.tencent.mm.t.c m(float paramFloat1, float paramFloat2)
  {
    GMTrace.i(19667863207936L, 146537);
    ListIterator localListIterator = ((com.tencent.mm.cache.c)pP()).rX();
    com.tencent.mm.t.c localc;
    int k;
    label377:
    do
    {
      localc = null;
      if (!localListIterator.hasPrevious()) {
        break;
      }
      localc = (com.tencent.mm.t.c)localListIterator.previous();
      Object localObject = k(paramFloat1, paramFloat2);
      float f1 = localObject[0];
      float f2 = localObject[1];
      localc.fWA.clear();
      localc.fWA.add(localc.I(localc.fWB - 180.0F));
      localc.fWA.add(localc.I(-localc.fWB));
      localc.fWA.add(localc.I(localc.fWB));
      localc.fWA.add(localc.I(-localc.fWB + 180.0F));
      localObject = new c.a(localc, localc.fWA);
      k = 0;
      int i = 0;
      int n = ((c.a)localObject).fWF - 1;
      int j = i;
      if (j < ((c.a)localObject).fWF)
      {
        int m;
        if ((localObject.fWE[j] >= f2) || (localObject.fWE[n] < f2))
        {
          m = k;
          if (localObject.fWE[n] < f2)
          {
            m = k;
            if (localObject.fWE[j] < f2) {}
          }
        }
        else
        {
          float f3 = localObject.fWD[j];
          float f4 = (f2 - localObject.fWE[j]) / (localObject.fWE[n] - localObject.fWE[j]);
          m = k;
          if ((localObject.fWD[n] - localObject.fWD[j]) * f4 + f3 < f1) {
            if (k != 0) {
              break label377;
            }
          }
        }
        for (i = 1;; i = 0)
        {
          m = i;
          i = j + 1;
          n = j;
          k = m;
          break;
        }
      }
    } while (k == 0);
    GMTrace.o(19667863207936L, 146537);
    return localc;
  }
  
  private com.tencent.mm.t.c qg()
  {
    GMTrace.i(19667997425664L, 146538);
    Object localObject = null;
    ListIterator localListIterator = ((com.tencent.mm.cache.c)pP()).rX();
    while (localListIterator.hasPrevious())
    {
      com.tencent.mm.t.c localc = (com.tencent.mm.t.c)localListIterator.previous();
      if (localc.fWv) {
        localObject = localc;
      }
      localc.setSelected(false);
    }
    GMTrace.o(19667997425664L, 146538);
    return (com.tencent.mm.t.c)localObject;
  }
  
  private void qh()
  {
    GMTrace.i(19668131643392L, 146539);
    w.d("MicroMsg.EmojiAndTextArtist", "[registerFocusTask]");
    if (this.ewm != null) {
      this.ewm.cancel();
    }
    this.ewm = new a(this);
    this.mTimer.schedule(this.ewm, 1500L);
    GMTrace.o(19668131643392L, 146539);
  }
  
  private void qi()
  {
    GMTrace.i(19668265861120L, 146540);
    w.d("MicroMsg.EmojiAndTextArtist", "[unRegisterFocusTask]");
    if (this.ewm != null) {
      this.ewm.cancel();
    }
    GMTrace.o(19668265861120L, 146540);
  }
  
  public final void a(SpannableString paramSpannableString, int paramInt)
  {
    GMTrace.i(19668400078848L, 146541);
    w.i("MicroMsg.EmojiAndTextArtist", "[addItem] text:%s", new Object[] { paramSpannableString });
    if (bg.L(paramSpannableString))
    {
      GMTrace.o(19668400078848L, 146541);
      return;
    }
    qi();
    qg();
    au(false);
    Object localObject = pX();
    paramSpannableString = new com.tencent.mm.t.e(ab.getContext(), pY(), ((com.tencent.mm.cache.c)pP()).aJ(true), (Rect)localObject, paramSpannableString, paramInt);
    paramSpannableString.setSelected(true);
    localObject = k(((Rect)localObject).centerX(), ((Rect)localObject).centerY());
    paramSpannableString.a(localObject[0], localObject[1], this.evi.bNO(), (int)getRotation());
    ((com.tencent.mm.cache.c)pP()).a(paramSpannableString);
    pZ();
    qh();
    GMTrace.o(19668400078848L, 146541);
  }
  
  public final void a(com.tencent.mm.t.e parame, SpannableString paramSpannableString, int paramInt)
  {
    GMTrace.i(19668668514304L, 146543);
    Object localObject = (com.tencent.mm.cache.c)pP();
    String str = parame.fWq;
    w.i("MicroMsg.EmojiAndTextCache", "[delete] id:%s", new Object[] { str });
    com.tencent.mm.t.c localc;
    if ((((com.tencent.mm.cache.c)localObject).fMi != null) && (((com.tencent.mm.cache.c)localObject).fMi.size() > 0))
    {
      localc = (com.tencent.mm.t.c)((com.tencent.mm.cache.c)localObject).fMi.peek();
      if (!localc.fWq.equalsIgnoreCase(str)) {
        break label233;
      }
      ((com.tencent.mm.cache.c)localObject).fMi.pop();
    }
    for (;;)
    {
      qi();
      qg();
      au(true);
      if (!bg.L(paramSpannableString))
      {
        localObject = pX();
        paramSpannableString = new com.tencent.mm.t.e(ab.getContext(), pY(), ((com.tencent.mm.cache.c)pP()).aJ(true), (Rect)localObject, paramSpannableString, paramInt);
        paramSpannableString.setSelected(true);
        localObject = parame.fWt;
        paramSpannableString.a(((PointF)localObject).x, ((PointF)localObject).y, this.evi.bNO(), parame.mRotation);
        ((com.tencent.mm.cache.c)pP()).a(paramSpannableString);
      }
      pZ();
      qh();
      GMTrace.o(19668668514304L, 146543);
      return;
      label233:
      w.e("MicroMsg.EmojiAndTextCache", "[delete] id:%s emojiItem:%s", new Object[] { str, localc });
    }
  }
  
  public final void b(i parami)
  {
    GMTrace.i(19668534296576L, 146542);
    w.i("MicroMsg.EmojiAndTextArtist", "[addEmojiItem] item:%s", new Object[] { parami });
    qi();
    qg();
    au(false);
    Object localObject = pX();
    parami = new com.tencent.mm.t.c(ab.getContext(), pY(), ((com.tencent.mm.cache.c)pP()).aJ(true), parami, (Rect)localObject);
    parami.setSelected(true);
    localObject = k(((Rect)localObject).centerX(), ((Rect)localObject).centerY());
    parami.a(localObject[0], localObject[1], getScale(), (int)getRotation());
    ((com.tencent.mm.cache.c)pP()).a(parami);
    pZ();
    qh();
    GMTrace.o(19668534296576L, 146542);
  }
  
  public final void onDestroy()
  {
    GMTrace.i(19667728990208L, 146536);
    super.onDestroy();
    qi();
    GMTrace.o(19667728990208L, 146536);
  }
  
  public final void onDraw(Canvas paramCanvas)
  {
    GMTrace.i(19667460554752L, 146534);
    b(paramCanvas);
    com.tencent.mm.t.c localc = ((com.tencent.mm.cache.c)pP()).rW();
    if ((localc != null) && (localc.fWv)) {
      localc.draw(paramCanvas);
    }
    GMTrace.o(19667460554752L, 146534);
  }
  
  public final a pN()
  {
    GMTrace.i(19667192119296L, 146532);
    a locala = a.eve;
    GMTrace.o(19667192119296L, 146532);
    return locala;
  }
  
  public final void pO()
  {
    GMTrace.i(19667326337024L, 146533);
    GMTrace.o(19667326337024L, 146533);
  }
  
  public final void pQ()
  {
    GMTrace.i(19667057901568L, 146531);
    super.pQ();
    int i = (int)ab.getResources().getDimension(a.c.tkW);
    this.ewn.set(0, pX().height() - i, pX().width(), pX().height());
    GMTrace.o(19667057901568L, 146531);
  }
  
  public final boolean q(MotionEvent paramMotionEvent)
  {
    GMTrace.i(19667594772480L, 146535);
    w.d("MicroMsg.EmojiAndTextArtist", "[onDispatchTouch] event:%s", new Object[] { Integer.valueOf(paramMotionEvent.getActionMasked()) });
    Object localObject1;
    switch (paramMotionEvent.getActionMasked())
    {
    case 3: 
    case 4: 
    default: 
      super.q(paramMotionEvent);
      bool = this.ewl;
      GMTrace.o(19667594772480L, 146535);
      return bool;
    case 0: 
      qi();
      localObject1 = m(paramMotionEvent.getX(), paramMotionEvent.getY());
      if (localObject1 == null)
      {
        this.ewl = false;
        localObject1 = ((com.tencent.mm.cache.c)pP()).rW();
        if (localObject1 == null) {
          break label1581;
        }
      }
      break;
    }
    label876:
    label1018:
    label1050:
    label1559:
    label1581:
    for (boolean bool = ((com.tencent.mm.t.c)localObject1).fWv; bool; bool = false)
    {
      qg();
      au(false);
      pZ();
      break;
      bool = ((com.tencent.mm.t.c)localObject1).fWz;
      qg();
      this.ewl = true;
      ((com.tencent.mm.t.c)localObject1).setSelected(true);
      ((com.tencent.mm.t.c)localObject1).fWz = bool;
      ((com.tencent.mm.t.c)localObject1).fWw.set(((com.tencent.mm.t.c)localObject1).fWt);
      ((com.tencent.mm.cache.c)pP()).b((com.tencent.mm.t.c)localObject1);
      au(true);
      pZ();
      break;
      if (this.ewl)
      {
        this.ewo = r(paramMotionEvent);
        this.ewq = ((int)Math.toDegrees(Math.atan2(s(paramMotionEvent)[0], s(paramMotionEvent)[1])));
        localObject1 = ((com.tencent.mm.cache.c)pP()).rW();
        if ((localObject1 == null) || (!((com.tencent.mm.t.c)localObject1).fWv)) {
          break;
        }
        this.ewr = ((com.tencent.mm.t.c)localObject1).mRotation;
        this.ewp = ((com.tencent.mm.t.c)localObject1).fy;
        break;
      }
      localObject1 = new int[2];
      if (paramMotionEvent.getPointerCount() > 1)
      {
        localObject1[0] = ((int)(paramMotionEvent.getX(0) + paramMotionEvent.getX(1)) / 2);
        localObject1[1] = ((int)(paramMotionEvent.getY(0) + paramMotionEvent.getY(1)) / 2);
      }
      localObject1 = m(localObject1[0], localObject1[1]);
      if (localObject1 == null) {
        break;
      }
      bool = ((com.tencent.mm.t.c)localObject1).fWz;
      qg();
      ((com.tencent.mm.t.c)localObject1).fWz = bool;
      this.ewl = true;
      ((com.tencent.mm.t.c)localObject1).setSelected(true);
      ((com.tencent.mm.cache.c)pP()).b((com.tencent.mm.t.c)localObject1);
      this.ewo = r(paramMotionEvent);
      this.ewq = ((int)Math.toDegrees(Math.atan2(s(paramMotionEvent)[0], s(paramMotionEvent)[1])));
      if ((localObject1 != null) && (((com.tencent.mm.t.c)localObject1).fWv))
      {
        this.ewr = ((com.tencent.mm.t.c)localObject1).mRotation;
        this.ewp = ((com.tencent.mm.t.c)localObject1).fy;
      }
      au(true);
      pZ();
      break;
      this.ews = true;
      break;
      if (this.ews)
      {
        this.ews = false;
        GMTrace.o(19667594772480L, 146535);
        return true;
      }
      if ((!this.ewl) || (!u(paramMotionEvent))) {
        break;
      }
      if ((!this.evN) && (this.ewu != null)) {
        this.ewu.onShow();
      }
      localObject1 = new int[2];
      localObject1[0] = ((int)(paramMotionEvent.getX(0) - this.evr.x));
      localObject1[1] = ((int)(paramMotionEvent.getY(0) - this.evr.y));
      float f1 = 1.0F;
      int i = 0;
      if (paramMotionEvent.getPointerCount() > 1)
      {
        if (0.0F != this.ewo) {
          f1 = r(paramMotionEvent) / this.ewo;
        }
        i = this.ewq - (int)Math.toDegrees(Math.atan2(s(paramMotionEvent)[0], s(paramMotionEvent)[1]));
      }
      for (;;)
      {
        w.i("MicroMsg.EmojiAndTextArtist", "[%s:%s]", new Object[] { Integer.valueOf(localObject1[0]), Integer.valueOf(localObject1[1]) });
        float f2 = localObject1[0];
        float f3 = localObject1[1];
        float f4 = this.ewp;
        int j = this.ewr;
        int k = paramMotionEvent.getPointerCount();
        localObject1 = ((com.tencent.mm.cache.c)pP()).rW();
        Object localObject3;
        Object localObject2;
        if (localObject1 != null)
        {
          this.lD.reset();
          this.lD.postRotate(-getRotation());
          localObject3 = this.lD;
          localObject2 = new Matrix();
          ((Matrix)localObject3).invert((Matrix)localObject2);
          localObject3 = new float[2];
          localObject3[0] = f2;
          localObject3[1] = f3;
          ((Matrix)localObject2).mapPoints((float[])localObject3);
          if (k <= 1) {
            break label1018;
          }
          ((com.tencent.mm.t.c)localObject1).b(localObject3[0] / getScale(), localObject3[1] / getScale(), f1 * f4, (i + j) % 360);
          ((com.tencent.mm.t.c)localObject1).wd();
          localObject2 = ((com.tencent.mm.t.c)localObject1).fWt;
          localObject2 = l(((PointF)localObject2).x, ((PointF)localObject2).y);
          w.i("MicroMsg.EmojiAndTextArtist", "mRubbishRect:%s pointF:%s", new Object[] { this.ewn, Float.valueOf(localObject2[1]) });
          if (this.ewn.top > localObject2[1]) {
            break label1050;
          }
          if (this.ewu != null) {
            this.ewu.L((localObject2[1] - this.ewn.top) / this.ewn.height());
          }
        }
        for (this.ewv = true;; this.ewv = false)
        {
          if ((localObject1 instanceof com.tencent.mm.t.e)) {
            ((com.tencent.mm.t.c)localObject1).fWz = false;
          }
          this.evN = true;
          pZ();
          break;
          ((com.tencent.mm.t.c)localObject1).b(localObject3[0] / getScale(), localObject3[1] / getScale(), 0.0F, ((com.tencent.mm.t.c)localObject1).mRotation);
          break label876;
          if ((this.ewu != null) && (this.ewv)) {
            this.ewu.yb();
          }
        }
        if (!isAlive())
        {
          w.e("MicroMsg.EmojiAndTextArtist", "[ACTION_UP] is not alive!");
          GMTrace.o(19667594772480L, 146535);
          return false;
        }
        localObject1 = ((com.tencent.mm.cache.c)pP()).rW();
        if (localObject1 != null)
        {
          if (!this.evk.contains((int)((com.tencent.mm.t.c)localObject1).fWt.x, (int)((com.tencent.mm.t.c)localObject1).fWt.y))
          {
            this.ewt.eqi = true;
            localObject2 = this.ewt;
            ((com.tencent.mm.b.c)localObject2).eql = ((com.tencent.mm.t.c)localObject1);
            ((com.tencent.mm.b.c)localObject2).epW = (((com.tencent.mm.t.c)localObject1).fWw.x - ((com.tencent.mm.t.c)localObject1).fWt.x);
            ((com.tencent.mm.b.c)localObject2).epX = (((com.tencent.mm.t.c)localObject1).fWw.y - ((com.tencent.mm.t.c)localObject1).fWt.y);
            ((com.tencent.mm.b.c)localObject2).eqm = ((com.tencent.mm.t.c)localObject1).fWq;
            localObject2 = this.ewt;
            if (((com.tencent.mm.b.b)localObject2).eqi)
            {
              ((com.tencent.mm.b.c)localObject2).epT = ValueAnimator.ofPropertyValuesHolder(new PropertyValuesHolder[] { PropertyValuesHolder.ofFloat("deltaY", new float[] { 0.0F, ((com.tencent.mm.b.c)localObject2).epX }), PropertyValuesHolder.ofFloat("deltaX", new float[] { 0.0F, ((com.tencent.mm.b.c)localObject2).epW }) });
              ((com.tencent.mm.b.c)localObject2).epT.addUpdateListener(new c.1((com.tencent.mm.b.c)localObject2));
              ((com.tencent.mm.b.c)localObject2).epT.addListener(new c.2((com.tencent.mm.b.c)localObject2));
              ((com.tencent.mm.b.c)localObject2).epT.setInterpolator(new LinearInterpolator());
              ((com.tencent.mm.b.c)localObject2).epT.setDuration(100L);
              ((com.tencent.mm.b.c)localObject2).epT.start();
            }
          }
          if ((localObject1 instanceof com.tencent.mm.t.e))
          {
            localObject2 = (com.tencent.mm.t.e)localObject1;
            if ((!((com.tencent.mm.t.c)localObject2).fWv) || (!((com.tencent.mm.t.c)localObject2).fWz)) {
              break label1559;
            }
            if (this.ewu != null) {
              this.ewu.a((com.tencent.mm.t.e)localObject2);
            }
          }
        }
        for (;;)
        {
          localObject2 = ((com.tencent.mm.t.c)localObject1).fWt;
          localObject2 = l(((PointF)localObject2).x, ((PointF)localObject2).y);
          w.i("MicroMsg.EmojiAndTextArtist", "mRubbishRect:%s pointF:%s", new Object[] { this.ewn, Float.valueOf(localObject2[1]) });
          if ((((com.tencent.mm.t.c)localObject1).fWv) && (this.ewn.top <= localObject2[1]) && (this.ewl) && (this.ewu != null))
          {
            ((com.tencent.mm.cache.c)pP()).rV();
            pZ();
          }
          qh();
          if ((this.evN) && (this.ewu != null)) {
            this.ewu.onHide();
          }
          this.evN = false;
          break;
          if (((com.tencent.mm.t.c)localObject2).fWv) {
            ((com.tencent.mm.t.c)localObject2).fWz = true;
          }
        }
        f1 = 1.0F;
      }
    }
  }
  
  final class a
    extends TimerTask
  {
    private b eww;
    private Handler mHandler;
    
    public a(b paramb)
    {
      GMTrace.i(19659675926528L, 146476);
      this.mHandler = new Handler(Looper.getMainLooper());
      this.eww = paramb;
      GMTrace.o(19659675926528L, 146476);
    }
    
    public final void run()
    {
      GMTrace.i(19659810144256L, 146477);
      this.mHandler.post(new Runnable()
      {
        public final void run()
        {
          GMTrace.i(19669608038400L, 146550);
          w.d("MicroMsg.EmojiAndTextArtist", "cancel focus!");
          com.tencent.mm.t.c localc = ((com.tencent.mm.cache.c)e.this.pP()).rW();
          if ((localc != null) && (localc.fWv))
          {
            localc.setSelected(false);
            e.a.a(e.a.this).au(false);
            e.a.a(e.a.this).pZ();
          }
          GMTrace.o(19669608038400L, 146550);
        }
      });
      GMTrace.o(19659810144256L, 146477);
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\d\e.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */