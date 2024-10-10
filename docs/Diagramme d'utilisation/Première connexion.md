````mermaid

%% Diagramme de cas d'utilisation en Mermaid

graph TD
    subgraph Application
        UC1((Cliquer sur le lien d'inscription))
        UC2(Renseigner les informations sur son profil)
        UC3(Voir les suggestions de profil)
        UC4(Consulter messagerie)
        UC5(Consulter notifications)
    end

    Actor1[Utilisateur] --> UC1
    UC1 --> UC2
    UC2 -.-> UC3
    UC3 -.-> UC4
    UC4 -.-> UC5


````

