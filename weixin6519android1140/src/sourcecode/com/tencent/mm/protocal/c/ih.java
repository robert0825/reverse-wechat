package com.tencent.mm.protocal.c;

import b.a.a.b;
import com.tencent.gmtrace.GMTrace;
import java.util.LinkedList;

public final class ih
  extends azh
{
  public String eJQ;
  public int jzH;
  public String jzI;
  public String tXc;
  public String tXd;
  public int tXe;
  public String tXg;
  public String tXm;
  public bdx tXn;
  
  public ih()
  {
    GMTrace.i(19144011415552L, 142634);
    GMTrace.o(19144011415552L, 142634);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(19144145633280L, 142635);
    if (paramInt == 0)
    {
      paramVarArgs = (b.a.a.c.a)paramVarArgs[0];
      if (this.uND == null) {
        throw new b("Not all required fields were included: BaseResponse");
      }
      if (this.uND != null)
      {
        paramVarArgs.fm(1, this.uND.aYq());
        this.uND.a(paramVarArgs);
      }
      paramVarArgs.fk(2, this.jzH);
      if (this.jzI != null) {
        paramVarArgs.e(3, this.jzI);
      }
      if (this.eJQ != null) {
        paramVarArgs.e(4, this.eJQ);
      }
      if (this.tXm != null) {
        paramVarArgs.e(5, this.tXm);
      }
      if (this.tXn != null)
      {
        paramVarArgs.fm(6, this.tXn.aYq());
        this.tXn.a(paramVarArgs);
      }
      if (this.tXc != null) {
        paramVarArgs.e(7, this.tXc);
      }
      if (this.tXd != null) {
        paramVarArgs.e(8, this.tXd);
      }
      paramVarArgs.fk(9, this.tXe);
      if (this.tXg != null) {
        paramVarArgs.e(10, this.tXg);
      }
      GMTrace.o(19144145633280L, 142635);
      return 0;
    }
    int i;
    if (paramInt == 1)
    {
      paramInt = 0;
      if (this.uND != null) {
        paramInt = b.a.a.a.fj(1, this.uND.aYq()) + 0;
      }
      i = paramInt + b.a.a.a.fh(2, this.jzH);
      paramInt = i;
      if (this.jzI != null) {
        paramInt = i + b.a.a.b.b.a.f(3, this.jzI);
      }
      i = paramInt;
      if (this.eJQ != null) {
        i = paramInt + b.a.a.b.b.a.f(4, this.eJQ);
      }
      paramInt = i;
      if (this.tXm != null) {
        paramInt = i + b.a.a.b.b.a.f(5, this.tXm);
      }
      i = paramInt;
      if (this.tXn != null) {
        i = paramInt + b.a.a.a.fj(6, this.tXn.aYq());
      }
      paramInt = i;
      if (this.tXc != null) {
        paramInt = i + b.a.a.b.b.a.f(7, this.tXc);
      }
      i = paramInt;
      if (this.tXd != null) {
        i = paramInt + b.a.a.b.b.a.f(8, this.tXd);
      }
      i += b.a.a.a.fh(9, this.tXe);
      paramInt = i;
      if (this.tXg != null) {
        paramInt = i + b.a.a.b.b.a.f(10, this.tXg);
      }
      GMTrace.o(19144145633280L, 142635);
      return paramInt;
    }
    if (paramInt == 2)
    {
      paramVarArgs = new b.a.a.a.a((byte[])paramVarArgs[0], unknownTagHandler);
      for (paramInt = azh.a(paramVarArgs); paramInt > 0; paramInt = azh.a(paramVarArgs)) {
        if (!super.a(paramVarArgs, this, paramInt)) {
          paramVarArgs.csW();
        }
      }
      if (this.uND == null) {
        throw new b("Not all required fields were included: BaseResponse");
      }
      GMTrace.o(19144145633280L, 142635);
      return 0;
    }
    if (paramInt == 3)
    {
      Object localObject1 = (b.a.a.a.a)paramVarArgs[0];
      ih localih = (ih)paramVarArgs[1];
      paramInt = ((Integer)paramVarArgs[2]).intValue();
      Object localObject2;
      boolean bool;
      switch (paramInt)
      {
      default: 
        GMTrace.o(19144145633280L, 142635);
        return -1;
      case 1: 
        paramVarArgs = ((b.a.a.a.a)localObject1).Gv(paramInt);
        i = paramVarArgs.size();
        paramInt = 0;
        while (paramInt < i)
        {
          localObject2 = (byte[])paramVarArgs.get(paramInt);
          localObject1 = new es();
          localObject2 = new b.a.a.a.a((byte[])localObject2, unknownTagHandler);
          for (bool = true; bool; bool = ((es)localObject1).a((b.a.a.a.a)localObject2, (com.tencent.mm.bm.a)localObject1, azh.a((b.a.a.a.a)localObject2))) {}
          localih.uND = ((es)localObject1);
          paramInt += 1;
        }
        GMTrace.o(19144145633280L, 142635);
        return 0;
      case 2: 
        localih.jzH = ((b.a.a.a.a)localObject1).yqV.nj();
        GMTrace.o(19144145633280L, 142635);
        return 0;
      case 3: 
        localih.jzI = ((b.a.a.a.a)localObject1).yqV.readString();
        GMTrace.o(19144145633280L, 142635);
        return 0;
      case 4: 
        localih.eJQ = ((b.a.a.a.a)localObject1).yqV.readString();
        GMTrace.o(19144145633280L, 142635);
        return 0;
      case 5: 
        localih.tXm = ((b.a.a.a.a)localObject1).yqV.readString();
        GMTrace.o(19144145633280L, 142635);
        return 0;
      case 6: 
        paramVarArgs = ((b.a.a.a.a)localObject1).Gv(paramInt);
        i = paramVarArgs.size();
        paramInt = 0;
        while (paramInt < i)
        {
          localObject2 = (byte[])paramVarArgs.get(paramInt);
          localObject1 = new bdx();
          localObject2 = new b.a.a.a.a((byte[])localObject2, unknownTagHandler);
          for (bool = true; bool; bool = ((bdx)localObject1).a((b.a.a.a.a)localObject2, (com.tencent.mm.bm.a)localObject1, azh.a((b.a.a.a.a)localObject2))) {}
          localih.tXn = ((bdx)localObject1);
          paramInt += 1;
        }
        GMTrace.o(19144145633280L, 142635);
        return 0;
      case 7: 
        localih.tXc = ((b.a.a.a.a)localObject1).yqV.readString();
        GMTrace.o(19144145633280L, 142635);
        return 0;
      case 8: 
        localih.tXd = ((b.a.a.a.a)localObject1).yqV.readString();
        GMTrace.o(19144145633280L, 142635);
        return 0;
      case 9: 
        localih.tXe = ((b.a.a.a.a)localObject1).yqV.nj();
        GMTrace.o(19144145633280L, 142635);
        return 0;
      }
      localih.tXg = ((b.a.a.a.a)localObject1).yqV.readString();
      GMTrace.o(19144145633280L, 142635);
      return 0;
    }
    GMTrace.o(19144145633280L, 142635);
    return -1;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\protocal\c\ih.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */