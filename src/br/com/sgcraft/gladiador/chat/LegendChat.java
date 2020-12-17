package br.com.sgcraft.gladiador.chat;

import br.com.devpaulo.legendchat.api.events.*;
import br.com.sgcraft.gladiador.mensagens.*;

import org.bukkit.event.*;

public class LegendChat implements Listener
{
    @EventHandler
    private void onChat(final ChatMessageEvent e) {
        if (Mensagens.containsVencedor(e.getSender().getName()) && e.getTags().contains("gladiador")) {
            e.setTagValue("gladiador", Mensagens.getTag());
        }
    }
}
