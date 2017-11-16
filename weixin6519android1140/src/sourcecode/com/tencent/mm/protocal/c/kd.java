package com.tencent.mm.protocal.c;

import b.a.a.b;
import com.tencent.gmtrace.GMTrace;
import java.util.LinkedList;

public final class kd
  extends azh
{
  public int omG;
  public String omH;
  public String omI;
  public String ree;
  public LinkedList<aoc> uaN;
  public aoc uaO;
  public String uaP;
  public boolean uaQ;
  public String uaR;
  public String url;
  
  public kd()
  {
    GMTrace.i(17874580144128L, 133176);
    this.uaN = new LinkedList();
    GMTrace.o(17874580144128L, 133176);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(17874714361856L, 133177);
    if (paramInt == 0)
    {
      paramVarArgs = (b.a.a.c.a)paramVarArgs[0];
      if (this.uND == null) {
        throw new b("Not all required fields were included: BaseResponse");
      }
      if (this.url == null) {
        throw new b("Not all required fields were included: url");
      }
      if (this.uaO == null) {
        throw new b("Not all required fields were included: bottom_item");
      }
      if (this.uND != null)
      {
        paramVarArgs.fm(1, this.uND.aYq());
        this.uND.a(paramVarArgs);
      }
      if (this.url != null) {
        paramVarArgs.e(2, this.url);
      }
      paramVarArgs.d(3, 8, this.uaN);
      if (this.uaO != null)
      {
        paramVarArgs.fm(4, this.uaO.aYq());
        this.uaO.a(paramVarArgs);
      }
      if (this.ree != null) {
        paramVarArgs.e(5, this.ree);
      }
      if (this.uaP != null) {
        paramVarArgs.e(6, this.uaP);
      }
      paramVarArgs.ah(7, this.uaQ);
      paramVarArgs.fk(8, this.omG);
      if (this.uaR != null) {
        paramVarArgs.e(9, this.uaR);
      }
      if (this.omH != null) {
        paramVarArgs.e(10, this.omH);
      }
      if (this.omI != null) {
        paramVarArgs.e(11, this.omI);
      }
      GMTrace.o(17874714361856L, 133177);
      return 0;
    }
    int i;
    if (paramInt == 1)
    {
      paramInt = 0;
      if (this.uND != null) {
        paramInt = b.a.a.a.fj(1, this.uND.aYq()) + 0;
      }
      i = paramInt;
      if (this.url != null) {
        i = paramInt + b.a.a.b.b.a.f(2, this.url);
      }
      i += b.a.a.a.c(3, 8, this.uaN);
      paramInt = i;
      if (this.uaO != null) {
        paramInt = i + b.a.a.a.fj(4, this.uaO.aYq());
      }
      i = paramInt;
      if (this.ree != null) {
        i = paramInt + b.a.a.b.b.a.f(5, this.ree);
      }
      paramInt = i;
      if (this.uaP != null) {
        paramInt = i + b.a.a.b.b.a.f(6, this.uaP);
      }
      i = paramInt + (b.a.a.b.b.a.cK(7) + 1) + b.a.a.a.fh(8, this.omG);
      paramInt = i;
      if (this.uaR != null) {
        paramInt = i + b.a.a.b.b.a.f(9, this.uaR);
      }
      i = paramInt;
      if (this.omH != null) {
        i = paramInt + b.a.a.b.b.a.f(10, this.omH);
      }
      paramInt = i;
      if (this.omI != null) {
        paramInt = i + b.a.a.b.b.a.f(11, this.omI);
      }
      GMTrace.o(17874714361856L, 133177);
      return paramInt;
    }
    if (paramInt == 2)
    {
      paramVarArgs = (byte[])paramVarArgs[0];
      this.uaN.clear();
      paramVarArgs = new b.a.a.a.a(paramVarArgs, unknownTagHandler);
      for (paramInt = azh.a(paramVarArgs); paramInt > 0; paramInt = azh.a(paramVarArgs)) {
        if (!super.a(paramVarArgs, this, paramInt)) {
          paramVarArgs.csW();
        }
      }
      if (this.uND == null) {
        throw new b("Not all required fields were included: BaseResponse");
      }
      if (this.url == null) {
        throw new b("Not all required fields were included: url");
      }
      if (this.uaO == null) {
        throw new b("Not all required fields were included: bottom_item");
      }
      GMTrace.o(17874714361856L, 133177);
      return 0;
    }
    if (paramInt == 3)
    {
      Object localObject1 = (b.a.a.a.a)paramVarArgs[0];
      kd localkd = (kd)paramVarArgs[1];
      paramInt = ((Integer)paramVarArgs[2]).intValue();
      Object localObject2;
      boolean bool;
      switch (paramInt)
      {
      default: 
        GMTrace.o(17874714361856L, 133177);
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
          localkd.uND = ((es)localObject1);
          paramInt += 1;
        }
        GMTrace.o(17874714361856L, 133177);
        return 0;
      case 2: 
        localkd.url = ((b.a.a.a.a)localObject1).yqV.readString();
        GMTrace.o(17874714361856L, 133177);
        return 0;
      case 3: 
        paramVarArgs = ((b.a.a.a.a)localObject1).Gv(paramInt);
        i = paramVarArgs.size();
        paramInt = 0;
        while (paramInt < i)
        {
          localObject2 = (byte[])paramVarArgs.get(paramInt);
          localObject1 = new aoc();
          localObject2 = new b.a.a.a.a((byte[])localObject2, unknownTagHandler);
          for (bool = true; bool; bool = ((aoc)localObject1).a((b.a.a.a.a)localObject2, (com.tencent.mm.bm.a)localObject1, azh.a((b.a.a.a.a)localObject2))) {}
          localkd.uaN.add(localObject1);
          paramInt += 1;
        }
        GMTrace.o(17874714361856L, 133177);
        return 0;
      case 4: 
        paramVarArgs = ((b.a.a.a.a)localObject1).Gv(paramInt);
        i = paramVarArgs.size();
        paramInt = 0;
        while (paramInt < i)
        {
          localObject2 = (byte[])paramVarArgs.get(paramInt);
          localObject1 = new aoc();
          localObject2 = new b.a.a.a.a((byte[])localObject2, unknownTagHandler);
          for (bool = true; bool; bool = ((aoc)localObject1).a((b.a.a.a.a)localObject2, (com.tencent.mm.bm.a)localObject1, azh.a((b.a.a.a.a)localObject2))) {}
          localkd.uaO = ((aoc)localObject1);
          paramInt += 1;
        }
        GMTrace.o(17874714361856L, 133177);
        return 0;
      case 5: 
        localkd.ree = ((b.a.a.a.a)localObject1).yqV.readString();
        GMTrace.o(17874714361856L, 133177);
        return 0;
      case 6: 
        localkd.uaP = ((b.a.a.a.a)localObject1).yqV.readString();
        GMTrace.o(17874714361856L, 133177);
        return 0;
      case 7: 
        localkd.uaQ = ((b.a.a.a.a)localObject1).csU();
        GMTrace.o(17874714361856L, 133177);
        return 0;
      case 8: 
        localkd.omG = ((b.a.a.a.a)localObject1).yqV.nj();
        GMTrace.o(17874714361856L, 133177);
        return 0;
      case 9: 
        localkd.uaR = ((b.a.a.a.a)localObject1).yqV.readString();
        GMTrace.o(17874714361856L, 133177);
        return 0;
      case 10: 
        localkd.omH = ((b.a.a.a.a)localObject1).yqV.readString();
        GMTrace.o(17874714361856L, 133177);
        return 0;
      }
      localkd.omI = ((b.a.a.a.a)localObject1).yqV.readString();
      GMTrace.o(17874714361856L, 133177);
      return 0;
    }
    GMTrace.o(17874714361856L, 133177);
    return -1;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\protocal\c\kd.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */