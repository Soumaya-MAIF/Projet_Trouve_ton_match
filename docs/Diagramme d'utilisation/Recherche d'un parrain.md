# Diagramme de cas d'utilisation : recherche d'un parrain
````mermaid

flowchart LR

    subgraph Application
        UC1((Connexion))
        UC2(Consulter les profils de parrains disponibles)
        UC3(Ouvrir un profil)
        UC4(Cliquer sur le bouton match)
        
    
    end

    Actor1[Utilisateur] --> UC1
    UC1 -.-> UC2
    UC2 --> UC3
    UC3 --> UC4


````