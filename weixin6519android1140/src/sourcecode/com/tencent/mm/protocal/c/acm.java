package com.tencent.mm.protocal.c;

import com.tencent.gmtrace.GMTrace;
import java.util.LinkedList;

public final class acm
  extends ayx
{
  public String eCE;
  public String eEU;
  public String lqh;
  public String lqi;
  public String lqj;
  public String tNa;
  
  public acm()
  {
    GMTrace.i(3746151006208L, 27911);
    GMTrace.o(3746151006208L, 27911);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(3746285223936L, 27912);
    if (paramInt == 0)
    {
      paramVarArgs = (b.a.a.c.a)paramVarArgs[0];
      if (this.uNh != null)
      {
        paramVarArgs.fm(1, this.uNh.aYq());
        this.uNh.a(paramVarArgs);
      }
      if (this.eCE != null) {
        paramVarArgs.e(2, this.eCE);
      }
      if (this.lqh != null) {
        paramVarArgs.e(3, this.lqh);
      }
      if (this.lqi != null) {
        paramVarArgs.e(4, this.lqi);
      }
      if (this.lqj != null) {
        paramVarArgs.e(5, this.lqj);
      }
      if (this.eEU != null) {
        paramVarArgs.e(6, this.eEU);
      }
      if (this.tNa != null) {
        paramVarArgs.e(7, this.tNa);
      }
      GMTrace.o(3746285223936L, 27912);
      return 0;
    }
    int i;
    if (paramInt == 1)
    {
      i = 0;
      if (this.uNh != null) {
        i = b.a.a.a.fj(1, this.uNh.aYq()) + 0;
      }
      paramInt = i;
      if (this.eCE != null) {
        paramInt = i + b.a.a.b.b.a.f(2, this.eCE);
      }
      i = paramInt;
      if (this.lqh != null) {
        i = paramInt + b.a.a.b.b.a.f(3, this.lqh);
      }
      paramInt = i;
      if (this.lqi != null) {
        paramInt = i + b.a.a.b.b.a.f(4, this.lqi);
      }
      i = paramInt;
      if (this.lqj != null) {
        i = paramInt + b.a.a.b.b.a.f(5, this.lqj);
      }
      paramInt = i;
      if (this.eEU != null) {
        paramInt = i + b.a.a.b.b.a.f(6, this.eEU);
      }
      i = paramInt;
      if (this.tNa != null) {
        i = paramInt + b.a.a.b.b.a.f(7, this.tNa);
      }
      GMTrace.o(3746285223936L, 27912);
      return i;
    }
    if (paramInt == 2)
    {
      paramVarArgs = new b.a.a.a.a((byte[])paramVarArgs[0], unknownTagHandler);
      for (paramInt = ayx.a(paramVarArgs); paramInt > 0; paramInt = ayx.a(paramVarArgs)) {
        if (!super.a(paramVarArgs, this, paramInt)) {
          paramVarArgs.csW();
        }
      }
      GMTrace.o(3746285223936L, 27912);
      return 0;
    }
    if (paramInt == 3)
    {
      Object localObject1 = (b.a.a.a.a)paramVarArgs[0];
      acm localacm = (acm)paramVarArgs[1];
      paramInt = ((Integer)paramVarArgs[2]).intValue();
      switch (paramInt)
      {
      default: 
        GMTrace.o(3746285223936L, 27912);
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
          localacm.uNh = ((er)localObject1);
          paramInt += 1;
        }
        GMTrace.o(3746285223936L, 27912);
        return 0;
      case 2: 
        localacm.eCE = ((b.a.a.a.a)localObject1).yqV.readString();
        GMTrace.o(3746285223936L, 27912);
        return 0;
      case 3: 
        localacm.lqh = ((b.a.a.a.a)localObject1).yqV.readString();
        GMTrace.o(3746285223936L, 27912);
        return 0;
      case 4: 
        localacm.lqi = ((b.a.a.a.a)localObject1).yqV.readString();
        GMTrace.o(3746285223936L, 27912);
        return 0;
      case 5: 
        localacm.lqj = ((b.a.a.a.a)localObject1).yqV.readString();
        GMTrace.o(3746285223936L, 27912);
        return 0;
      case 6: 
        localacm.eEU = ((b.a.a.a.a)localObject1).yqV.readString();
        GMTrace.o(3746285223936L, 27912);
        return 0;
      }
      localacm.tNa = ((b.a.a.a.a)localObject1).yqV.readString();
      GMTrace.o(3746285223936L, 27912);
      return 0;
    }
    GMTrace.o(3746285223936L, 27912);
    return -1;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\protocal\c\acm.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */