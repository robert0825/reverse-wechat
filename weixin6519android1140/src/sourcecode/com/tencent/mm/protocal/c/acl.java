package com.tencent.mm.protocal.c;

import b.a.a.b;
import com.tencent.gmtrace.GMTrace;
import java.util.LinkedList;

public final class acl
  extends azh
{
  public String lPi;
  public String lPj;
  public azp tQz;
  public LinkedList<qp> tTM;
  public String tTT;
  public String uhA;
  public LinkedList<rh> uqI;
  public String usF;
  
  public acl()
  {
    GMTrace.i(3706690994176L, 27617);
    this.uqI = new LinkedList();
    this.tTM = new LinkedList();
    GMTrace.o(3706690994176L, 27617);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(3706825211904L, 27618);
    if (paramInt == 0)
    {
      paramVarArgs = (b.a.a.c.a)paramVarArgs[0];
      if (this.uND == null) {
        throw new b("Not all required fields were included: BaseResponse");
      }
      if (this.usF == null) {
        throw new b("Not all required fields were included: BannerUrl");
      }
      if (this.lPi == null) {
        throw new b("Not all required fields were included: Name");
      }
      if (this.lPj == null) {
        throw new b("Not all required fields were included: Desc");
      }
      if (this.uhA == null) {
        throw new b("Not all required fields were included: HeadUrl");
      }
      if (this.tTT == null) {
        throw new b("Not all required fields were included: BizName");
      }
      if (this.tQz == null) {
        throw new b("Not all required fields were included: ReqBuf");
      }
      if (this.uND != null)
      {
        paramVarArgs.fm(1, this.uND.aYq());
        this.uND.a(paramVarArgs);
      }
      if (this.usF != null) {
        paramVarArgs.e(2, this.usF);
      }
      if (this.lPi != null) {
        paramVarArgs.e(3, this.lPi);
      }
      if (this.lPj != null) {
        paramVarArgs.e(4, this.lPj);
      }
      if (this.uhA != null) {
        paramVarArgs.e(5, this.uhA);
      }
      if (this.tTT != null) {
        paramVarArgs.e(6, this.tTT);
      }
      paramVarArgs.d(7, 8, this.uqI);
      if (this.tQz != null)
      {
        paramVarArgs.fm(8, this.tQz.aYq());
        this.tQz.a(paramVarArgs);
      }
      paramVarArgs.d(9, 8, this.tTM);
      GMTrace.o(3706825211904L, 27618);
      return 0;
    }
    int i;
    if (paramInt == 1)
    {
      i = 0;
      if (this.uND != null) {
        i = b.a.a.a.fj(1, this.uND.aYq()) + 0;
      }
      paramInt = i;
      if (this.usF != null) {
        paramInt = i + b.a.a.b.b.a.f(2, this.usF);
      }
      i = paramInt;
      if (this.lPi != null) {
        i = paramInt + b.a.a.b.b.a.f(3, this.lPi);
      }
      paramInt = i;
      if (this.lPj != null) {
        paramInt = i + b.a.a.b.b.a.f(4, this.lPj);
      }
      i = paramInt;
      if (this.uhA != null) {
        i = paramInt + b.a.a.b.b.a.f(5, this.uhA);
      }
      paramInt = i;
      if (this.tTT != null) {
        paramInt = i + b.a.a.b.b.a.f(6, this.tTT);
      }
      i = paramInt + b.a.a.a.c(7, 8, this.uqI);
      paramInt = i;
      if (this.tQz != null) {
        paramInt = i + b.a.a.a.fj(8, this.tQz.aYq());
      }
      i = b.a.a.a.c(9, 8, this.tTM);
      GMTrace.o(3706825211904L, 27618);
      return paramInt + i;
    }
    if (paramInt == 2)
    {
      paramVarArgs = (byte[])paramVarArgs[0];
      this.uqI.clear();
      this.tTM.clear();
      paramVarArgs = new b.a.a.a.a(paramVarArgs, unknownTagHandler);
      for (paramInt = azh.a(paramVarArgs); paramInt > 0; paramInt = azh.a(paramVarArgs)) {
        if (!super.a(paramVarArgs, this, paramInt)) {
          paramVarArgs.csW();
        }
      }
      if (this.uND == null) {
        throw new b("Not all required fields were included: BaseResponse");
      }
      if (this.usF == null) {
        throw new b("Not all required fields were included: BannerUrl");
      }
      if (this.lPi == null) {
        throw new b("Not all required fields were included: Name");
      }
      if (this.lPj == null) {
        throw new b("Not all required fields were included: Desc");
      }
      if (this.uhA == null) {
        throw new b("Not all required fields were included: HeadUrl");
      }
      if (this.tTT == null) {
        throw new b("Not all required fields were included: BizName");
      }
      if (this.tQz == null) {
        throw new b("Not all required fields were included: ReqBuf");
      }
      GMTrace.o(3706825211904L, 27618);
      return 0;
    }
    if (paramInt == 3)
    {
      Object localObject1 = (b.a.a.a.a)paramVarArgs[0];
      acl localacl = (acl)paramVarArgs[1];
      paramInt = ((Integer)paramVarArgs[2]).intValue();
      Object localObject2;
      boolean bool;
      switch (paramInt)
      {
      default: 
        GMTrace.o(3706825211904L, 27618);
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
          localacl.uND = ((es)localObject1);
          paramInt += 1;
        }
        GMTrace.o(3706825211904L, 27618);
        return 0;
      case 2: 
        localacl.usF = ((b.a.a.a.a)localObject1).yqV.readString();
        GMTrace.o(3706825211904L, 27618);
        return 0;
      case 3: 
        localacl.lPi = ((b.a.a.a.a)localObject1).yqV.readString();
        GMTrace.o(3706825211904L, 27618);
        return 0;
      case 4: 
        localacl.lPj = ((b.a.a.a.a)localObject1).yqV.readString();
        GMTrace.o(3706825211904L, 27618);
        return 0;
      case 5: 
        localacl.uhA = ((b.a.a.a.a)localObject1).yqV.readString();
        GMTrace.o(3706825211904L, 27618);
        return 0;
      case 6: 
        localacl.tTT = ((b.a.a.a.a)localObject1).yqV.readString();
        GMTrace.o(3706825211904L, 27618);
        return 0;
      case 7: 
        paramVarArgs = ((b.a.a.a.a)localObject1).Gv(paramInt);
        i = paramVarArgs.size();
        paramInt = 0;
        while (paramInt < i)
        {
          localObject2 = (byte[])paramVarArgs.get(paramInt);
          localObject1 = new rh();
          localObject2 = new b.a.a.a.a((byte[])localObject2, unknownTagHandler);
          for (bool = true; bool; bool = ((rh)localObject1).a((b.a.a.a.a)localObject2, (com.tencent.mm.bm.a)localObject1, azh.a((b.a.a.a.a)localObject2))) {}
          localacl.uqI.add(localObject1);
          paramInt += 1;
        }
        GMTrace.o(3706825211904L, 27618);
        return 0;
      case 8: 
        paramVarArgs = ((b.a.a.a.a)localObject1).Gv(paramInt);
        i = paramVarArgs.size();
        paramInt = 0;
        while (paramInt < i)
        {
          localObject2 = (byte[])paramVarArgs.get(paramInt);
          localObject1 = new azp();
          localObject2 = new b.a.a.a.a((byte[])localObject2, unknownTagHandler);
          for (bool = true; bool; bool = ((azp)localObject1).a((b.a.a.a.a)localObject2, (com.tencent.mm.bm.a)localObject1, azh.a((b.a.a.a.a)localObject2))) {}
          localacl.tQz = ((azp)localObject1);
          paramInt += 1;
        }
        GMTrace.o(3706825211904L, 27618);
        return 0;
      }
      paramVarArgs = ((b.a.a.a.a)localObject1).Gv(paramInt);
      i = paramVarArgs.size();
      paramInt = 0;
      while (paramInt < i)
      {
        localObject2 = (byte[])paramVarArgs.get(paramInt);
        localObject1 = new qp();
        localObject2 = new b.a.a.a.a((byte[])localObject2, unknownTagHandler);
        for (bool = true; bool; bool = ((qp)localObject1).a((b.a.a.a.a)localObject2, (com.tencent.mm.bm.a)localObject1, azh.a((b.a.a.a.a)localObject2))) {}
        localacl.tTM.add(localObject1);
        paramInt += 1;
      }
      GMTrace.o(3706825211904L, 27618);
      return 0;
    }
    GMTrace.o(3706825211904L, 27618);
    return -1;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\protocal\c\acl.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */