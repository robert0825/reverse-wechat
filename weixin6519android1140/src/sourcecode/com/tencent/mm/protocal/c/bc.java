package com.tencent.mm.protocal.c;

import com.tencent.gmtrace.GMTrace;
import java.util.LinkedList;

public final class bc
  extends ayx
{
  public String bssid;
  public int cfz;
  public String gVs;
  public int scene;
  public String ssid;
  public String tPe;
  public long tPf;
  public int tPh;
  public String tPj;
  public int tPs;
  public bb tPt;
  public be tPu;
  public int tPv;
  public int type;
  
  public bc()
  {
    GMTrace.i(3795408912384L, 28278);
    GMTrace.o(3795408912384L, 28278);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(3795543130112L, 28279);
    if (paramInt == 0)
    {
      paramVarArgs = (b.a.a.c.a)paramVarArgs[0];
      if (this.uNh != null)
      {
        paramVarArgs.fm(1, this.uNh.aYq());
        this.uNh.a(paramVarArgs);
      }
      if (this.gVs != null) {
        paramVarArgs.e(2, this.gVs);
      }
      paramVarArgs.fk(3, this.scene);
      paramVarArgs.fk(4, this.type);
      paramVarArgs.fk(5, this.tPs);
      if (this.ssid != null) {
        paramVarArgs.e(6, this.ssid);
      }
      if (this.bssid != null) {
        paramVarArgs.e(7, this.bssid);
      }
      paramVarArgs.T(8, this.tPf);
      if (this.tPt != null)
      {
        paramVarArgs.fm(9, this.tPt.aYq());
        this.tPt.a(paramVarArgs);
      }
      if (this.tPu != null)
      {
        paramVarArgs.fm(10, this.tPu.aYq());
        this.tPu.a(paramVarArgs);
      }
      paramVarArgs.fk(11, this.tPh);
      if (this.tPe != null) {
        paramVarArgs.e(12, this.tPe);
      }
      paramVarArgs.fk(13, this.cfz);
      if (this.tPj != null) {
        paramVarArgs.e(14, this.tPj);
      }
      paramVarArgs.fk(15, this.tPv);
      GMTrace.o(3795543130112L, 28279);
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
      if (this.gVs != null) {
        i = paramInt + b.a.a.b.b.a.f(2, this.gVs);
      }
      i = i + b.a.a.a.fh(3, this.scene) + b.a.a.a.fh(4, this.type) + b.a.a.a.fh(5, this.tPs);
      paramInt = i;
      if (this.ssid != null) {
        paramInt = i + b.a.a.b.b.a.f(6, this.ssid);
      }
      i = paramInt;
      if (this.bssid != null) {
        i = paramInt + b.a.a.b.b.a.f(7, this.bssid);
      }
      i += b.a.a.a.S(8, this.tPf);
      paramInt = i;
      if (this.tPt != null) {
        paramInt = i + b.a.a.a.fj(9, this.tPt.aYq());
      }
      i = paramInt;
      if (this.tPu != null) {
        i = paramInt + b.a.a.a.fj(10, this.tPu.aYq());
      }
      i += b.a.a.a.fh(11, this.tPh);
      paramInt = i;
      if (this.tPe != null) {
        paramInt = i + b.a.a.b.b.a.f(12, this.tPe);
      }
      i = paramInt + b.a.a.a.fh(13, this.cfz);
      paramInt = i;
      if (this.tPj != null) {
        paramInt = i + b.a.a.b.b.a.f(14, this.tPj);
      }
      i = b.a.a.a.fh(15, this.tPv);
      GMTrace.o(3795543130112L, 28279);
      return paramInt + i;
    }
    if (paramInt == 2)
    {
      paramVarArgs = new b.a.a.a.a((byte[])paramVarArgs[0], unknownTagHandler);
      for (paramInt = ayx.a(paramVarArgs); paramInt > 0; paramInt = ayx.a(paramVarArgs)) {
        if (!super.a(paramVarArgs, this, paramInt)) {
          paramVarArgs.csW();
        }
      }
      GMTrace.o(3795543130112L, 28279);
      return 0;
    }
    if (paramInt == 3)
    {
      Object localObject1 = (b.a.a.a.a)paramVarArgs[0];
      bc localbc = (bc)paramVarArgs[1];
      paramInt = ((Integer)paramVarArgs[2]).intValue();
      Object localObject2;
      boolean bool;
      switch (paramInt)
      {
      default: 
        GMTrace.o(3795543130112L, 28279);
        return -1;
      case 1: 
        paramVarArgs = ((b.a.a.a.a)localObject1).Gv(paramInt);
        i = paramVarArgs.size();
        paramInt = 0;
        while (paramInt < i)
        {
          localObject2 = (byte[])paramVarArgs.get(paramInt);
          localObject1 = new er();
          localObject2 = new b.a.a.a.a((byte[])localObject2, unknownTagHandler);
          for (bool = true; bool; bool = ((er)localObject1).a((b.a.a.a.a)localObject2, (com.tencent.mm.bm.a)localObject1, ayx.a((b.a.a.a.a)localObject2))) {}
          localbc.uNh = ((er)localObject1);
          paramInt += 1;
        }
        GMTrace.o(3795543130112L, 28279);
        return 0;
      case 2: 
        localbc.gVs = ((b.a.a.a.a)localObject1).yqV.readString();
        GMTrace.o(3795543130112L, 28279);
        return 0;
      case 3: 
        localbc.scene = ((b.a.a.a.a)localObject1).yqV.nj();
        GMTrace.o(3795543130112L, 28279);
        return 0;
      case 4: 
        localbc.type = ((b.a.a.a.a)localObject1).yqV.nj();
        GMTrace.o(3795543130112L, 28279);
        return 0;
      case 5: 
        localbc.tPs = ((b.a.a.a.a)localObject1).yqV.nj();
        GMTrace.o(3795543130112L, 28279);
        return 0;
      case 6: 
        localbc.ssid = ((b.a.a.a.a)localObject1).yqV.readString();
        GMTrace.o(3795543130112L, 28279);
        return 0;
      case 7: 
        localbc.bssid = ((b.a.a.a.a)localObject1).yqV.readString();
        GMTrace.o(3795543130112L, 28279);
        return 0;
      case 8: 
        localbc.tPf = ((b.a.a.a.a)localObject1).yqV.nk();
        GMTrace.o(3795543130112L, 28279);
        return 0;
      case 9: 
        paramVarArgs = ((b.a.a.a.a)localObject1).Gv(paramInt);
        i = paramVarArgs.size();
        paramInt = 0;
        while (paramInt < i)
        {
          localObject2 = (byte[])paramVarArgs.get(paramInt);
          localObject1 = new bb();
          localObject2 = new b.a.a.a.a((byte[])localObject2, unknownTagHandler);
          for (bool = true; bool; bool = ((bb)localObject1).a((b.a.a.a.a)localObject2, (com.tencent.mm.bm.a)localObject1, ayx.a((b.a.a.a.a)localObject2))) {}
          localbc.tPt = ((bb)localObject1);
          paramInt += 1;
        }
        GMTrace.o(3795543130112L, 28279);
        return 0;
      case 10: 
        paramVarArgs = ((b.a.a.a.a)localObject1).Gv(paramInt);
        i = paramVarArgs.size();
        paramInt = 0;
        while (paramInt < i)
        {
          localObject2 = (byte[])paramVarArgs.get(paramInt);
          localObject1 = new be();
          localObject2 = new b.a.a.a.a((byte[])localObject2, unknownTagHandler);
          for (bool = true; bool; bool = ((be)localObject1).a((b.a.a.a.a)localObject2, (com.tencent.mm.bm.a)localObject1, ayx.a((b.a.a.a.a)localObject2))) {}
          localbc.tPu = ((be)localObject1);
          paramInt += 1;
        }
        GMTrace.o(3795543130112L, 28279);
        return 0;
      case 11: 
        localbc.tPh = ((b.a.a.a.a)localObject1).yqV.nj();
        GMTrace.o(3795543130112L, 28279);
        return 0;
      case 12: 
        localbc.tPe = ((b.a.a.a.a)localObject1).yqV.readString();
        GMTrace.o(3795543130112L, 28279);
        return 0;
      case 13: 
        localbc.cfz = ((b.a.a.a.a)localObject1).yqV.nj();
        GMTrace.o(3795543130112L, 28279);
        return 0;
      case 14: 
        localbc.tPj = ((b.a.a.a.a)localObject1).yqV.readString();
        GMTrace.o(3795543130112L, 28279);
        return 0;
      }
      localbc.tPv = ((b.a.a.a.a)localObject1).yqV.nj();
      GMTrace.o(3795543130112L, 28279);
      return 0;
    }
    GMTrace.o(3795543130112L, 28279);
    return -1;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\protocal\c\bc.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */