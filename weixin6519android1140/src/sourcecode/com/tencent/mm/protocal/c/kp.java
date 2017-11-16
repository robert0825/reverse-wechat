package com.tencent.mm.protocal.c;

import com.tencent.gmtrace.GMTrace;
import java.util.LinkedList;

public final class kp
  extends ayx
{
  public String eJQ;
  public int mFu;
  public String tXd;
  public String ubn;
  public String ubo;
  public String ubq;
  
  public kp()
  {
    GMTrace.i(19142669238272L, 142624);
    GMTrace.o(19142669238272L, 142624);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(19142803456000L, 142625);
    if (paramInt == 0)
    {
      paramVarArgs = (b.a.a.c.a)paramVarArgs[0];
      if (this.uNh != null)
      {
        paramVarArgs.fm(1, this.uNh.aYq());
        this.uNh.a(paramVarArgs);
      }
      if (this.eJQ != null) {
        paramVarArgs.e(2, this.eJQ);
      }
      if (this.ubq != null) {
        paramVarArgs.e(3, this.ubq);
      }
      if (this.tXd != null) {
        paramVarArgs.e(4, this.tXd);
      }
      paramVarArgs.fk(5, this.mFu);
      if (this.ubo != null) {
        paramVarArgs.e(6, this.ubo);
      }
      if (this.ubn != null) {
        paramVarArgs.e(7, this.ubn);
      }
      GMTrace.o(19142803456000L, 142625);
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
      if (this.eJQ != null) {
        paramInt = i + b.a.a.b.b.a.f(2, this.eJQ);
      }
      i = paramInt;
      if (this.ubq != null) {
        i = paramInt + b.a.a.b.b.a.f(3, this.ubq);
      }
      paramInt = i;
      if (this.tXd != null) {
        paramInt = i + b.a.a.b.b.a.f(4, this.tXd);
      }
      i = paramInt + b.a.a.a.fh(5, this.mFu);
      paramInt = i;
      if (this.ubo != null) {
        paramInt = i + b.a.a.b.b.a.f(6, this.ubo);
      }
      i = paramInt;
      if (this.ubn != null) {
        i = paramInt + b.a.a.b.b.a.f(7, this.ubn);
      }
      GMTrace.o(19142803456000L, 142625);
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
      GMTrace.o(19142803456000L, 142625);
      return 0;
    }
    if (paramInt == 3)
    {
      Object localObject1 = (b.a.a.a.a)paramVarArgs[0];
      kp localkp = (kp)paramVarArgs[1];
      paramInt = ((Integer)paramVarArgs[2]).intValue();
      switch (paramInt)
      {
      default: 
        GMTrace.o(19142803456000L, 142625);
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
          localkp.uNh = ((er)localObject1);
          paramInt += 1;
        }
        GMTrace.o(19142803456000L, 142625);
        return 0;
      case 2: 
        localkp.eJQ = ((b.a.a.a.a)localObject1).yqV.readString();
        GMTrace.o(19142803456000L, 142625);
        return 0;
      case 3: 
        localkp.ubq = ((b.a.a.a.a)localObject1).yqV.readString();
        GMTrace.o(19142803456000L, 142625);
        return 0;
      case 4: 
        localkp.tXd = ((b.a.a.a.a)localObject1).yqV.readString();
        GMTrace.o(19142803456000L, 142625);
        return 0;
      case 5: 
        localkp.mFu = ((b.a.a.a.a)localObject1).yqV.nj();
        GMTrace.o(19142803456000L, 142625);
        return 0;
      case 6: 
        localkp.ubo = ((b.a.a.a.a)localObject1).yqV.readString();
        GMTrace.o(19142803456000L, 142625);
        return 0;
      }
      localkp.ubn = ((b.a.a.a.a)localObject1).yqV.readString();
      GMTrace.o(19142803456000L, 142625);
      return 0;
    }
    GMTrace.o(19142803456000L, 142625);
    return -1;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\protocal\c\kp.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */