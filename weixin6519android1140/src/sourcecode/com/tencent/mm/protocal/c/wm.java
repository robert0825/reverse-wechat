package com.tencent.mm.protocal.c;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.bm.b;
import java.util.LinkedList;

public final class wm
  extends ayx
{
  public b jAf;
  public int jHO;
  public String jHP;
  public String jHQ;
  public String jHR;
  public String jHS;
  public String jxF;
  public String jxL;
  public int time_stamp;
  public int uoH;
  
  public wm()
  {
    GMTrace.i(3648843153408L, 27186);
    GMTrace.o(3648843153408L, 27186);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(3648977371136L, 27187);
    if (paramInt == 0)
    {
      paramVarArgs = (b.a.a.c.a)paramVarArgs[0];
      if (this.uNh != null)
      {
        paramVarArgs.fm(1, this.uNh.aYq());
        this.uNh.a(paramVarArgs);
      }
      if (this.jxL != null) {
        paramVarArgs.e(2, this.jxL);
      }
      paramVarArgs.fk(3, this.jHO);
      if (this.jHP != null) {
        paramVarArgs.e(4, this.jHP);
      }
      if (this.jHQ != null) {
        paramVarArgs.e(5, this.jHQ);
      }
      paramVarArgs.fk(6, this.time_stamp);
      if (this.jHR != null) {
        paramVarArgs.e(7, this.jHR);
      }
      if (this.jxF != null) {
        paramVarArgs.e(8, this.jxF);
      }
      if (this.jHS != null) {
        paramVarArgs.e(9, this.jHS);
      }
      if (this.jAf != null) {
        paramVarArgs.b(10, this.jAf);
      }
      paramVarArgs.fk(11, this.uoH);
      GMTrace.o(3648977371136L, 27187);
      return 0;
    }
    int i;
    if (paramInt == 1)
    {
      paramInt = 0;
      if (this.uNh != null) {
        paramInt = b.a.a.a.fj(1, this.uNh.aYq()) + 0;
      }
      i = paramInt;
      if (this.jxL != null) {
        i = paramInt + b.a.a.b.b.a.f(2, this.jxL);
      }
      i += b.a.a.a.fh(3, this.jHO);
      paramInt = i;
      if (this.jHP != null) {
        paramInt = i + b.a.a.b.b.a.f(4, this.jHP);
      }
      i = paramInt;
      if (this.jHQ != null) {
        i = paramInt + b.a.a.b.b.a.f(5, this.jHQ);
      }
      i += b.a.a.a.fh(6, this.time_stamp);
      paramInt = i;
      if (this.jHR != null) {
        paramInt = i + b.a.a.b.b.a.f(7, this.jHR);
      }
      i = paramInt;
      if (this.jxF != null) {
        i = paramInt + b.a.a.b.b.a.f(8, this.jxF);
      }
      paramInt = i;
      if (this.jHS != null) {
        paramInt = i + b.a.a.b.b.a.f(9, this.jHS);
      }
      i = paramInt;
      if (this.jAf != null) {
        i = paramInt + b.a.a.a.a(10, this.jAf);
      }
      paramInt = b.a.a.a.fh(11, this.uoH);
      GMTrace.o(3648977371136L, 27187);
      return i + paramInt;
    }
    if (paramInt == 2)
    {
      paramVarArgs = new b.a.a.a.a((byte[])paramVarArgs[0], unknownTagHandler);
      for (paramInt = ayx.a(paramVarArgs); paramInt > 0; paramInt = ayx.a(paramVarArgs)) {
        if (!super.a(paramVarArgs, this, paramInt)) {
          paramVarArgs.csW();
        }
      }
      GMTrace.o(3648977371136L, 27187);
      return 0;
    }
    if (paramInt == 3)
    {
      Object localObject1 = (b.a.a.a.a)paramVarArgs[0];
      wm localwm = (wm)paramVarArgs[1];
      paramInt = ((Integer)paramVarArgs[2]).intValue();
      switch (paramInt)
      {
      default: 
        GMTrace.o(3648977371136L, 27187);
        return -1;
      case 1: 
        paramVarArgs = ((b.a.a.a.a)localObject1).Gv(paramInt);
        i = paramVarArgs.size();
        paramInt = 0;
        while (paramInt < i)
        {
          Object localObject2 = (byte[])paramVarArgs.get(paramInt);
          localObject1 = new er();
          localObject2 = new b.a.a.a.a((byte[])localObject2, unknownTagHandler);
          for (boolean bool = true; bool; bool = ((er)localObject1).a((b.a.a.a.a)localObject2, (com.tencent.mm.bm.a)localObject1, ayx.a((b.a.a.a.a)localObject2))) {}
          localwm.uNh = ((er)localObject1);
          paramInt += 1;
        }
        GMTrace.o(3648977371136L, 27187);
        return 0;
      case 2: 
        localwm.jxL = ((b.a.a.a.a)localObject1).yqV.readString();
        GMTrace.o(3648977371136L, 27187);
        return 0;
      case 3: 
        localwm.jHO = ((b.a.a.a.a)localObject1).yqV.nj();
        GMTrace.o(3648977371136L, 27187);
        return 0;
      case 4: 
        localwm.jHP = ((b.a.a.a.a)localObject1).yqV.readString();
        GMTrace.o(3648977371136L, 27187);
        return 0;
      case 5: 
        localwm.jHQ = ((b.a.a.a.a)localObject1).yqV.readString();
        GMTrace.o(3648977371136L, 27187);
        return 0;
      case 6: 
        localwm.time_stamp = ((b.a.a.a.a)localObject1).yqV.nj();
        GMTrace.o(3648977371136L, 27187);
        return 0;
      case 7: 
        localwm.jHR = ((b.a.a.a.a)localObject1).yqV.readString();
        GMTrace.o(3648977371136L, 27187);
        return 0;
      case 8: 
        localwm.jxF = ((b.a.a.a.a)localObject1).yqV.readString();
        GMTrace.o(3648977371136L, 27187);
        return 0;
      case 9: 
        localwm.jHS = ((b.a.a.a.a)localObject1).yqV.readString();
        GMTrace.o(3648977371136L, 27187);
        return 0;
      case 10: 
        localwm.jAf = ((b.a.a.a.a)localObject1).csV();
        GMTrace.o(3648977371136L, 27187);
        return 0;
      }
      localwm.uoH = ((b.a.a.a.a)localObject1).yqV.nj();
      GMTrace.o(3648977371136L, 27187);
      return 0;
    }
    GMTrace.o(3648977371136L, 27187);
    return -1;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\protocal\c\wm.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */